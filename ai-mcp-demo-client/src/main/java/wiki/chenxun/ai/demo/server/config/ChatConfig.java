package wiki.chenxun.ai.demo.server.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author: chenxun
 * @date: 2025/4/29
 * @version: 1.0
 * @desc
 **/
@Configuration
public class ChatConfig {


    @Bean
    WebClient webClient() {
        return WebClient.builder().build();
    }


    /**
     *  ai client 配置
     * @param chatModel
     * @return
     */
    @Bean
    ChatClient chatClient(OpenAiChatModel chatModel) {
        return ChatClient
                .builder(chatModel)
                .defaultAdvisors()
                //  .defaultAdvisors() todo  记录上下文
                .build();
    }





}
