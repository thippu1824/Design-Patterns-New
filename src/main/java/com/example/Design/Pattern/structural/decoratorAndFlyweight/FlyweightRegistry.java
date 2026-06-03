package com.example.Design.Pattern.structural.decoratorAndFlyweight;

public interface FlyweightRegistry<T> {
    void add(String key, T flywieght);
    T get(String key);
}
