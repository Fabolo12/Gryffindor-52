package m1.l12.store;

import m1.l12.store.model.Bucket;
import m1.l12.store.model.Product;

public class Store {
    static void main() {
        final Product product1 = new Product();
        product1.setId("1");
        product1.setName("Product 1");
        product1.setPrice(10.0);

        final Product product2 = new Product();
        product2.setId("2");
        product2.setName("Product 2");
        product2.setPrice(20.0);

        Product[] products = new Product[2];
        products[0] = product1;
        products[1] = product2;

        final Bucket bucket = new Bucket();
        bucket.setId("1");
        bucket.setProducts(products);
        bucket.definePrice();
        System.out.println("Bucket price: " + bucket.getPrice());

    }
}
