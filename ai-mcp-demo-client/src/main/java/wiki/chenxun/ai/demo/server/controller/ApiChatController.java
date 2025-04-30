package wiki.chenxun.ai.demo.server.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenxun
 * @date: 2025/4/29
 * @version: 1.0
 * @desc
 **/
@RestController
@RequestMapping(value = "/chat")
public class ApiChatController {

    @Autowired
    private ChatClient chatClient;

    @Autowired
    private ChatMemory chatMemory;

    @GetMapping(value = "/mysql")
    public String chat(@RequestParam("msg") String msg,@RequestParam("chatMemoryConversationId") String chatMemoryConversationId){
       return chatClient.prompt()
                .user(msg)
               .tools("getTableSchema","query","listAllTablesName")
               .advisors(advisor -> advisor.param("chat_memory_conversation_id", chatMemoryConversationId)
                       .param("chat_memory_response_size", 100))
                .call()
                .content();
    }

    @GetMapping(value = "/clear")
    public void clear(@RequestParam("chatMemoryConversationId") String chatMemoryConversationId){
        //清理会话
        chatMemory.clear(chatMemoryConversationId);
    }


}
