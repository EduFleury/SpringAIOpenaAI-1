package br.com.eduardo.spring.ai.controller;

import br.com.eduardo.spring.ai.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerativeAIController {

    private final ChatService service;

    public GenerativeAIController(ChatService service) {
        this.service = service;
    }

    @GetMapping("ask-ai")
    public String getResponse(@RequestParam String prompt){
        return service.getResponse(prompt);
    }
}
