package com.baeldung.freemarker.model;

import java.util.List;

/**
 * Created by SuM_ on 1/27/17.
 */
public class User {

    private String name;
    private int age;
    private List<String> messages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Name is: " + name + ". Age is: " + age + ". Message is: " + messages.toString();
    }
}
