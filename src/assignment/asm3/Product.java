package assignment.asm3;

public class Product {
    int id;
    String productName;
    int qty;
    double price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean checkQty(){
        if(qty>0){
            System.out.println("Con hang");
            return true;
        }
        System.out.println("Het hang");
        return false;

    }
}
