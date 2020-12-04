package com.zd.qtbuy.module;

/**
 * @ClassName: StockInfo
 * @Description:
 * @Author: zhangdi
 * @Date: 20-12-1 下午3:34
 */
public class StockInfo {
    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 成本
     */
    private double cost;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
