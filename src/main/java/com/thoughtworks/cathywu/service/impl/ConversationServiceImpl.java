package com.thoughtworks.cathywu.service.impl;

import com.thoughtworks.cathywu.common.ConversationPool;
import com.thoughtworks.cathywu.service.ConversationService;

import java.util.List;

/**
 * Created by lzwu on 10/14/14.
 */
public class ConversationServiceImpl implements ConversationService {

    @Override
    public void addTalk(String userName, String talk) {
        String text = userName + " says: " + talk;
        ConversationPool.getPool().addTalk(text);
    }

    @Override
    public List<String> getAllConversations() {
        return ConversationPool.getPool().getTalks();
    }
}
