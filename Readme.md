## 项目相关技术启动方式
### 1.启动elasticsearch
进入到E:\App\elasticsearch-7.17.23目录下，cmd执行

```cmd
.\bin\elasticsearch.bat
```

### 2.启动Kibana
进入到E:\App\kibana-7.17.23目录下面，cmd执行

```cmd
.\bin\kibana.bat
```

### 3.启动etcd
进入到E:\App\etcd-v3.5.15目录下面，cmd执行

```cmd
etcd
```

### 4.Hotkey启动
用idea打开E:\App\hotkey-master-v0.0.4这个项目，他是基于java开发的
#### 4.1.先启动
E:\App\hotkey-master-v0.0.4\worker\src\main\java\com\jd\platform\hotkey\worker
下面的
WorkerApplication.java

#### 4.2.再启动

E:\App\hotkey-master-v0.0.4\dashboard\src\main\java\com\jd\platform\hotkey\dashboard
下面的
DashboardApplication.java

### 5.启动sentinel
```cmd
java -Dserver.port=8131 -jar sentinel-dashboard-1.8.6.jar
```

### 6.启动Nacos
E:\App\nacos-server-2.2.0目录下面，cmd执行
```cmd
startup.cmd -m standalone
```