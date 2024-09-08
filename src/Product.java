public abstract class Product {
    private String name;
    private double price;

    /**
     * Конструктор товара.
     *
     * @param name  название товара.
     * @param price цена товара.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Получить название.
     */
    public String getName() {
        return name;
    }

    /**
     * Получить цену.
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Название: " + name + '\n' +
                "Цена: " + price +
                "$\n";
    }
}
