

package entity;

import java.util.Date;

public class History {
    private Product product;
    private Customer customer;
    private Date takeOnProduct;
    private int quantity;
    private int history;
    

    public History() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTakeOnProduct() {
        return takeOnProduct;
    }

    public void setTakeOnProduct(Date takeOnProduct) {
        this.takeOnProduct = takeOnProduct;
    }
    
    String ProductPriceHistory;
    
    public String getProductPriceHistory() {
        return ProductPriceHistory;
    }

    public void setProductPriceHistory(String productPriceHistory) {
        ProductPriceHistory = productPriceHistory;
    }

    @Override
    public String toString() {
        return "History{" + 
                "product=" + product + 
                ", customer=" + customer + 
                ", takeOnProduct=" + takeOnProduct + 
                ", ProductPriceHistory='" + ProductPriceHistory + '\'' +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }
}
