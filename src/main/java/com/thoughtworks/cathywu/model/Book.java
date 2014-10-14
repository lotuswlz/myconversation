package com.thoughtworks.cathywu.model;

/**
 * Created by lzwu on 10/14/14.
 */
public class Book extends KeyItem {
    private String author;
    private String introduction;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
