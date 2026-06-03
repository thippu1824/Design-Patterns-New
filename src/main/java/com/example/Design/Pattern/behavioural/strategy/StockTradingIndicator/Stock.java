package com.example.Design.Pattern.behavioural.strategy.StockTradingIndicator;

public class Stock {

    private double currentPrice;
    private double previousPrice;

    public Stock(double currentPrice, double previousPrice) {
        this.currentPrice = currentPrice;
        this.previousPrice = previousPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(double previousPrice) {
        this.previousPrice = previousPrice;
    }
}
