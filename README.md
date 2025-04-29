# ai-mcp-demo
 demo for ai mcp
 
# 前置要求
1. jdk17
2. maven
3. mysql（8+），可以换其他版本，但需要修改配置文件
4. deepseek api token

# 下载代码
git clone https://github.com/ai-mcp/ai-mcp-demo.git

# 编译代码  
mvn install 

# 修改配置文件
> 配置deepseek 的api token

# 初始化数据
> 脚本在 init/init.sql

# 启动服务
1. server 启动 wiki.chenxun.ai.mcp.demo.server.ServerApplication#main
2. client 启动 wiki.chenxun.ai.demo.server.ClientApplication#main

# 测试
> 浏览器输入 http://localhost:9778/chat/mysql?msg=%E7%8E%8B%E4%BA%94%E5%92%8C%E5%BC%A0%E4%B8%89%E7%9A%84%E8%8B%B1%E8%AF%AD%E6%88%90%E7%BB%A9%E6%98%AF%E5%A4%9A%E5%B0%91
