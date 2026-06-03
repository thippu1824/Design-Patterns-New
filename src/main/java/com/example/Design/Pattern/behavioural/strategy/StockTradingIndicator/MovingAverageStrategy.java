package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

public class MovingAverageStrategy implements TradingIndicatorStrategy {

    @Override
    public double calculate(Stock stock) {
        System.out.println("Calculating moving average");
        return stock.getCurrentPrice() - stock.getPreviousPrice() / 2;
    }

    @Override
    public boolean supportsType(IndicatorType type) {
        return type == IndicatorType.MOVING_AVERAGE;
    }
}
