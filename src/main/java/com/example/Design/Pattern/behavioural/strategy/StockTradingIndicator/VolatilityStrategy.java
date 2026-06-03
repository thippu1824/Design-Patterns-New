package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

public class VolatilityStrategy implements TradingIndicatorStrategy {

    @Override
    public double calculate(Stock stock) {
        System.out.println("Calculating volatility");
        return Math.abs(stock.getCurrentPrice() - stock.getPreviousPrice());
    }

    @Override
    public boolean supportsType(IndicatorType type) {
        return type == IndicatorType.VOLATILITY;
    }

}
