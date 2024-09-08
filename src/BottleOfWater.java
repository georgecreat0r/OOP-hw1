public class BottleOfWater extends Product{

    private int volume;

    /**
     * Конструктор товара.
     *
     * @param name  название товара.
     * @param price цена товара.
     */
    public BottleOfWater(String name, double price) {
        super(name, price);
    }

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Название: " + getName() + "\nЦена: " + getPrice() + "$\nОбъём: " + volume + "мл\n";
    }
}
