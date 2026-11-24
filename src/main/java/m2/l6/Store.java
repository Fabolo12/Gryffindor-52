package m2.l6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {

    private List<Product> products = new ArrayList<>();

    static void main() {
        final Store store = new Store();
        store.products.add(new Product("Product A", true, 10));
        store.products.add(new Product("Product B", false, 100));
        store.products.add(new Product("Product C", true, 55));
        store.products.add(new Product("Product C", true, 55));
        store.products.add(new Product("Product D", true, 0));
        store.products.add(new Product("Product E", true, 1));
        store.products.add(new Product("Product F", true, 2));

        int pageNumber = 0;
        int pageSize = 3;

        store.products.stream()
                .filter(Product::isAvailable)
                .distinct()
                .sorted((p1, p2) -> Integer.compare(p2.getPopularity(), p1.getPopularity()))
                .skip(pageNumber * pageSize)
                .limit(pageSize)
                .forEach(product -> System.out.println(
                        product.getName() + " - Popularity: " + product.getPopularity()
                ));

    }

    static class Product {
        private String name;
        private boolean available;
        private int popularity;

        public Product(final String name, final boolean available, final int popularity) {
            this.name = name;
            this.available = available;
            this.popularity = popularity;
        }


        public void setName(final String name) {
            this.name = name;
        }

        public void setAvailable(final boolean available) {
            this.available = available;
        }

        public void setPopularity(final int popularity) {
            this.popularity = popularity;
        }

        public String getName() {
            return name;
        }

        public boolean isAvailable() {
            return available;
        }

        public int getPopularity() {
            return popularity;
        }

        @Override
        public boolean equals(final Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            final Product product = (Product) o;
            return available == product.available && popularity == product.popularity && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, available, popularity);
        }
    }
}
