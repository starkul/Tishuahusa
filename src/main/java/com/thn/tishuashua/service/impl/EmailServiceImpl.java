package com.thn.tishuashua.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
import com.thn.tishuashua.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 邮件服务实现类
 */
@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    @Override
    public void sendWarningEmail(long userId, long count) {
        MailAccount account = new MailAccount();
        account.setHost("smtp.mxhichina.com");
        account.setPort(465);
        account.setSslEnable(true);
        account.setFrom("admin@company.com");
        account.setUser("admin@company.com");
        account.setPass("your_password");
        
        String subject = "用户访问频率告警";
        String content = String.format("检测到用户ID: %d 访问过于频繁，当前访问次数: %d，已触发告警阈值。", userId, count);
        
        try {
            MailUtil.send(account, CollUtil.newArrayList("accept@company.com"),
                         subject, content, false);
        } catch (Exception e) {
            log.error("发送告警邮件失败", e);
        }
    }
}
