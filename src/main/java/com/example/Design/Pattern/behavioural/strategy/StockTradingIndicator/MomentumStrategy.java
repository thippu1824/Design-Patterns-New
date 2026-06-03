package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

public class MomentumStrategy implements TradingIndicatorStrategy {

    @Override
    public double calculate(Stock stock) {
        System.out.println("Calculating momentum");
        return stock.getCurrentPrice() - stock.getPreviousPrice();
    }

    @Override
    public boolean supportsType(IndicatorType type) {
        return type == IndicatorType.MOMENTUM;
    }
}
