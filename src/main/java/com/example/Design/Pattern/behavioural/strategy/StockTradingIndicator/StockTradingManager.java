package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

import java.util.List;

public class StockTradingManager {

    private final List<TradingIndicatorStrategy> strategies;

    public StockTradingManager(List<TradingIndicatorStrategy> strategies) {
        this.strategies = strategies;
    }

    public double calculateIndicator(IndicatorType type, Stock stock) {

        TradingIndicatorStrategy strategy = strategies.stream().filter(s -> s.supportsType(type)).findFirst()
            .orElseThrow(() -> new RuntimeException("No strategy found"));

        return strategy.calculate(stock);

    }
}
