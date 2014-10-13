package com.thoughtworks.cathywu.service;

import java.util.List;

/**
 * Created by lzwu on 10/14/14.
 */
public interface ConversationService {
    void addTalk(String userName, String talk);
    List<String> getAllConversations();
}
