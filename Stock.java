public class Stock {
    private int quantity;

    public Stock(int initialQuantity) {
        this.quantity = initialQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int quantityToAdd) {
        if (quantityToAdd > 0) {
            this.quantity += quantityToAdd;
        }
    }

    public void reduceStock(int quantityToReduce) {
        if (quantityToReduce > 0 && quantityToReduce <= this.quantity) {
            this.quantity -= quantityToReduce;
        }
    }

    public boolean isStockSufficient(int quantityRequired) {
        return quantityRequired <= this.quantity;
    }
}