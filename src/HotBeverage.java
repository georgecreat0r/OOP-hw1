public class HotBeverage extends Product {

    private int temp;
    private int volume;

    /**
     * Конструктор товара.
     *
     * @param name  название товара.
     * @param price цена товара.
     * @param temp температура горячего напитка.
     */
    public HotBeverage(String name, double price, int volume, int temp) {
        super(name, price);
        this.temp = temp;
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public int getVolume() {
        return volume;
    }

    // Переопределение метода toString.
    @Override
    public String toString() {
        return "Название: " + getName() + "\nЦена: " + getPrice()
                + "$\nТемпература: " + temp + "°C\n" + "Объём: " + volume + "мл\n";
    }
}
