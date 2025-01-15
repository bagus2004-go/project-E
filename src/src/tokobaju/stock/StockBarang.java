package tokobaju.stock;

import tokobaju.produk.Product;
import java.util.ArrayList;
import java.util.List;

public class StockBarang {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductById(int id) throws Exception {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new Exception("Product with ID " + id + " not found");
    }
}
