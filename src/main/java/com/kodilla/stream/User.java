package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPost;
    private String group;

    public User(String username, int age, int numberOfPost, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(user.username, username) && Objects.equals(user.group, group) && Objects.equals(user.age, age) && Objects.equals(user.numberOfPost, numberOfPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPost, group);
    }
}
