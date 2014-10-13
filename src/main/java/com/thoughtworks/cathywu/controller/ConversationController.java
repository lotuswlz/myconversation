package com.thoughtworks.cathywu.controller;

import com.thoughtworks.cathywu.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @RequestMapping(value = "/listConversation", method = RequestMethod.GET)
    @ResponseBody
    public List<String> listBooks() {
        return conversationService.getAllConversations();
    }

    @RequestMapping(value = "/say", method = RequestMethod.POST)
    @ResponseBody
    public String addTalk(@RequestBody Map valueMap) {
        conversationService.addTalk((String) valueMap.get("userName"), (String) valueMap.get("talk"));
        return "ok";
    }
}
