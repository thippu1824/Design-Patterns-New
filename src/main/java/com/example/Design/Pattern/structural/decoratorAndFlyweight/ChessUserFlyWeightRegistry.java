package com.example.Design.Pattern.structural.decoratorAndFlyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessUserFlyWeightRegistry implements FlyweightRegistry<ChessUserIntrinsicState> {

    private final Map<String, ChessUserIntrinsicState> cache = new HashMap<>();

    @Override
    public void add(String key, ChessUserIntrinsicState flyweight) {
        cache.put(key, flyweight);
    }

    @Override
    public ChessUserIntrinsicState get(String key) {
        return cache.get(key);
    }
}
