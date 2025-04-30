package wiki.chenxun.ai.mcp.demo.server.config;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wiki.chenxun.ai.mcp.demo.server.service.McpService;

import java.util.List;

/**
 * @author: chenxun
 * @date: 2025/4/29
 * @version: 1.0
 * @desc
 **/
@Configuration
public class McpServerConfig {

    @Autowired
    private List<McpService> mcpServiceList;

    @Bean
    public ToolCallbackProvider mcpTools() {
        Object[] toolObjects=  mcpServiceList.toArray(new McpService[0]);
        return MethodToolCallbackProvider.builder().toolObjects(toolObjects).build();
    }


}
