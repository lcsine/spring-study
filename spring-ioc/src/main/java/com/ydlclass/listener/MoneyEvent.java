package com.ydlclass.listener;

import org.springframework.context.ApplicationEvent;

public class MoneyEvent extends ApplicationEvent {
    private String orderId;
    private String money;

    public MoneyEvent(Object source, String orderId, String money) {
        super(source);
        this.orderId = orderId;
        this.money = money;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public MoneyEvent(Object source) {
        super(source);
    }
}
