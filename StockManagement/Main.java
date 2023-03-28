package com.oops_problems;


public class StockReport {
    private String stockName;
    private String numberOfShare;
    private String sharePrice;

    public StockReport(String stockName, String numberOfShare, String sharePrice) {
        this.stockName = stockName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(String numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public String getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(String sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String toString(){
        return "\nStock name= "+stockName+"\nNumber of shares = "+numberOfShare+"\nshare Price = "+sharePrice;
    }
}
