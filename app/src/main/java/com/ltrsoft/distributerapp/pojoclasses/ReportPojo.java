package com.ltrsoft.distributerapp.pojoclasses;

public class ReportPojo {

    //    String totalsales,expenses,projects,availableDevices,invoices,
//            soldDevices,upcomingDevices,pandingOrders;
    String Title, cost;

    public ReportPojo() {
    }

    public ReportPojo(String title, String cost) {
        Title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
