package com.github.piotrkwalczak.rsocket.benchmark;

import java.util.Date;

public class Wrapper<T> {
    private final T value;

    private Date sentAt = new Date();

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
