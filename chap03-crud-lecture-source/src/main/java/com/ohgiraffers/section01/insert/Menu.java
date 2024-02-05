package com.ohgiraffers.section01.insert;

public class Menu {
    public Menu() {
    }

    private int menuCode;
    private String menuname;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public Menu(String menuname, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuname = menuname;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public String getMenuname() {
        return menuname;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuname='" + menuname + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
