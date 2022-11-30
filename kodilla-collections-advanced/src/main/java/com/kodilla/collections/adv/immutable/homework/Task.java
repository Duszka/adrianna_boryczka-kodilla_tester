package com.kodilla.collections.adv.immutable.homework;

public class Task {
    private final String title;
    private final double duration;

    public Task(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return title;
    }

    public final double getDuration() {
        return duration;
    }


}
