package com.thoughtworks.cathywu.service.impl;

import com.thoughtworks.cathywu.common.ConversationPool;
import com.thoughtworks.cathywu.service.ConversationService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lzwu on 10/14/14.
 */
public class ConversationServiceImpl implements ConversationService {

    @Override
    public void addTalk(String userName, String talk) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String text = userName + " (" + formatter.format(new Date()) + "): " + talk;
        ConversationPool.getPool().addTalk(text);
    }

    @Override
    public List<String> getAllConversations() {
        return ConversationPool.getPool().getTalks();
    }
}
