package BT1.model;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private int price;

    public Product() {
    }

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.price - product.price;
    }

    public static Comparator<Product> ProductNameComparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            String productName1 = o1.getProductName().toUpperCase();
            String productName2 = o2.getProductName().toUpperCase();
            return productName1.compareTo(productName2);
        }
    };
}
