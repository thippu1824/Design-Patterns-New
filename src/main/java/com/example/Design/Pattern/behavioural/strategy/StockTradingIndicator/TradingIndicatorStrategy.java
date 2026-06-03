package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

public interface TradingIndicatorStrategy {

    double calculate(Stock stock);
    boolean supportsType(IndicatorType type);
}
