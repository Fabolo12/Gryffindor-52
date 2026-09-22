package m1.l12.store.model;

public class Bucket {
    private String id;
    private Product[] products;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(final Product[] products) {
        this.products = products;
    }

    public double getPrice() {
        return price;
    }

    public void definePrice() {
        if (products == null) {
            price = 0;
            return;
        }

        for (int i = 0; i < products.length; i++) {
            price += products[i].getPrice();
        }
    }
}