package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<TradingIndicatorStrategy> strategies = List.of(
            new MomentumStrategy(),
            new MovingAverageStrategy(),
            new VolatilityStrategy()
        );

        StockTradingManager manager = new StockTradingManager(strategies);
        Stock stock = new Stock(120,561);
        double movingAverage = manager.calculateIndicator(IndicatorType.MOVING_AVERAGE,stock);
        System.out.println("Moving average : " + movingAverage);
        double volatility = manager.calculateIndicator(IndicatorType.VOLATILITY, stock);
        System.out.println("Volatility : " + volatility);

    }
}
