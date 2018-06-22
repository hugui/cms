### FEBS后台权限管理系统

FEBS是一个简单高效的后台权限管理系统。项目基础框架采用全新的Java Web开发框架 —— Spring Boot，消除了繁杂的XML配置，使得二次开发更为简单；数据访问层采用Mybatis，同时引入了通用Mapper和PageHelper插件，可快速高效的对单表进行增删改查操作，消除了大量传统XML配置SQL的代码；安全框架采用时下流行的Apache Shiro，可实现对按钮级别的权限控制；前端页面使用Bootstrap构建，主题风格为时下Google最新设计语言Material Design，并提供多套配色以供选择。FEBS意指：Fast，Easy use，Beautiful和Safe。
<!--more-->
### 功能模块
系统功能模块组成如下所示：
```
├─系统管理
│  ├─字典管理
│  ├─用户管理
│  ├─菜单管理
│  ├─角色管理
│  └─部门管理
├─系统监控
│  ├─在线用户
│  └─系统日志
├─任务调度
│  ├─定时任务
│  └─调度日志
└─网络资源
    ├─One一个
    │  ├─散文
    │  ├─绘画
    │  └─语文
    ├─天气查询
    ├─影视资讯
    │  ├─即将上映
    │  └─正在热映
    └─每日一文
```
### 技术选型
#### 后端
- 基础框架：Spring Boot 1.5.13.RELEASE

- 持久层框架：Mybatis 3.4.5

- 安全框架：Apache Shiro 1.4.0

- 摸板引擎：Thymeleaf 3.0.2.RELEASE

- 数据库连接池：阿里巴巴Druid 1.1.10

- 缓存框架：Ehcache

- 日志打印：logback

- 其他：fastjson，poi，javacsv，quartz等。

#### 前端
 
- 基础框架：Bootstrap 4

- JavaScript框架：jQuery

- 消息组件：Bootstrap notify

- 提示框插件：SweetAlert2

- 树形插件：jsTree

- 树形表格插件：jqTreeGrid

- 表格插件：BootstrapTable

- 表单校验插件：jQuery-validate

- 多选下拉框插件：multiple-select

- 图表插件：Highcharts

- 时间插件：daterangepicker

#### 开发环境

- 语言：Java 8

- IDE：Eclipse Oxygen & IDEA 2018.1.4(Ultimate Edition)

- 依赖管理：Maven

- 数据库：Oracle 11g & MySQL5.7

- 版本管理：SVN，git

### 开发与部署

下载后以Maven项目的方式导入Eclipse或者IDEA。

开发时直接使用Spring Boot的入口类`cc.mrbird.Application`启动即可，访问地址[localhost:8080](localhost:8080)，账号mrbird，密码123456。

部署时，使用Maven将项目打包成febs.jar，然后使用命令`java -jar febs.jar`启动即可。在Linux下部署Spring Boot jar，并编写启停脚本可参考链接[https://mrbird.cc/Linux%20Spring-Boot-jar.html](https://mrbird.cc/Linux%20Spring-Boot-jar.html)。
