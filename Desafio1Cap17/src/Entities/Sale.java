package Entities;

public class Sale {
    Integer Month;
    Integer Year;
    String Seller;
    Integer Items;
    Double Total;

    public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
        Month = month;
        Year = year;
        Seller = seller;
        Items = items;
        Total = total;
    }

    public Integer getMonth() {
        return Month;
    }

    public void setMonth(Integer month) {
        Month = month;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public String getSeller() {
        return Seller;
    }

    public void setSeller(String seller) {
        Seller = seller;
    }

    public Integer getItems() {
        return Items;
    }

    public void setItems(Integer items) {
        Items = items;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }

    public Double averagePrice()
    {
        return getTotal()/getItems();
    }

    @Override
    public String toString(){
        return getMonth() +
                "/" + getYear() +
                ", " + getSeller() +
                ", " + getItems() +
                ", " + getTotal() +
                ", " + "pm = " + String.format("%.2f", averagePrice());
    }
}
