package com.company;

import java.io.Closeable;
import java.io.IOException;

public class Car implements Closeable {


    @Override
    public String toString() {
        return "Car{}";
    }

    @Override
    public void close() throws IOException {
        System.out.println("close");
    }

    public void drive() {
        System.out.println("car driving");
    }
}