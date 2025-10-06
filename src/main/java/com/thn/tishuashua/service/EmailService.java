package com.thn.tishuashua.service;

/**
 * 邮件服务
 */
public interface EmailService {
    /**
     * 发送告警邮件
     * @param userId 用户ID
     * @param count 访问次数
     */
    void sendWarningEmail(long userId, long count);
}
