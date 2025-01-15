package tokobaju.keranjang;

import tokobaju.produk.Product;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();

    public void addItem(Product product, int quantity) throws Exception {
        if (quantity > product.getStock()) {
            throw new Exception("Insufficient stock for product: " + product.getName());
        }
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
