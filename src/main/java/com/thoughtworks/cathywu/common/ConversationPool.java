package com.thoughtworks.cathywu.common;

import com.google.common.collect.Lists;

import java.util.List;

public class ConversationPool {
    private List<String> talks;

    private static final int MAX_TALKS_COUNT = 20;

    private static ConversationPool pool = null;
    private ConversationPool() {
        talks = Lists.newArrayList();
    }
    public static ConversationPool getPool() {
        if (pool == null) {
            pool = new ConversationPool();
        }
        return pool;
    }

    public void addTalk(String text) {
        talks.add(text);
        if (talks.size() > MAX_TALKS_COUNT) {
            talks = talks.subList(talks.size() - MAX_TALKS_COUNT, talks.size());
        }
    }

    public List<String> getTalks() {
        return this.talks;
    }
}
