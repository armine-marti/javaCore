package homework.onlineShop.model;

import java.util.Objects;

public class Product {
    private String productID;//product ID
    private String productName;
    private String description;
    private double price;
    private int stockQty;
    private ProductType productType; //product type
public Product(){

}

    public Product(String productID, String productName, String description, double price, int stockQty, ProductType productType) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockQty = stockQty;
        this.productType = productType;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && stockQty == product.stockQty && Objects.equals(productID, product.productID) && Objects.equals(productName, product.productName) && Objects.equals(description, product.description) && productType == product.productType;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(productID);
        result = 31 * result + Objects.hashCode(productName);
        result = 31 * result + Objects.hashCode(description);
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + stockQty;
        result = 31 * result + Objects.hashCode(productType);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockQty=" + stockQty +
                ", productType=" + productType +
                '}';
    }
}
