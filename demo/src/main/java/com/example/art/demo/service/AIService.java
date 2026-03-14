package com.example.art.demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final ChatClient chatClient;

    public AIService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String askAboutArtwork(String question) {

        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }
}