package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String supplierName;

    public Product() {
    }

    public Product(int id, String name, double price, String supplierName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.supplierName = supplierName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
