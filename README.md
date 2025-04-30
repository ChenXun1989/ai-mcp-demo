# ai-mcp-demo
 demo for ai mcp
 
# 前置要求
> 1. jdk17
> 2. maven
> 3. mysql（8+），可以换其他版本，但需要修改配置文件
> 4. deepseek api token


# 下载代码
> git clone git@github.com:ChenXun1989/ai-mcp-demo.git

# 编译代码  
> mvn install 

# 修改配置文件
> 配置deepseek 的api token

# 初始化数据
> 脚本在 init/init.sql

# 启动服务
> 1. server 启动 wiki.chenxun.ai.mcp.demo.server.ServerApplication#main
> 2. client 启动 wiki.chenxun.ai.demo.server.ClientApplication#main

# 测试
### 查询张三英语成绩
> http://localhost:9778/chat/mysql?chatMemoryConversationId=1&msg=张三英语成绩
### 查询李四英语成绩
> http://localhost:9778/chat/mysql?chatMemoryConversationId=1&msg=李四英语成绩
### 查询他俩英语成绩加起来多少分
> http://localhost:9778/chat/mysql?chatMemoryConversationId=1&msg=他俩英语成绩加起来多少分

### 清理上下文记忆
> http://localhost:9778/chat/clear?chatMemoryConversationId=1

# 联系作者
## 个人博客
[https://www.chenxun.wiki](https://www.chenxun.wiki)