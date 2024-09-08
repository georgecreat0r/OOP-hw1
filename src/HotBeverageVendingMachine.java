import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine {

    private final List<Product> productList = new ArrayList<>(); // Список для хранения напитков.
    private double cashRegister = 0; // Касса, заполняемая при продаже напитков.

    // Заполнение торгового автомата горячими напитками при создании экземпляра класса.
    public HotBeverageVendingMachine() {
        this.productList.add(new HotBeverage("Кофе", 0.59, 400, 75));
        this.productList.add(new HotBeverage("Чай", 0.49, 400, 80));
        this.productList.add(new HotBeverage("Какао", 0.79, 400, 90));
        this.productList.add(new HotBeverage("Горячий шоколад", 0.99, 400, 90));

        this.productList.add(new HotBeverage("Кофе", 0.79, 600, 75));
        this.productList.add(new HotBeverage("Чай", 0.69, 600, 80));
        this.productList.add(new HotBeverage("Какао", 0.99, 600, 90));
        this.productList.add(new HotBeverage("Горячий шоколад", 1.19, 600, 90));

    }


    /**
     * Переопределённый метод.
     *
     * @param name название напитка.
     * @return Возвращает горячий напиток или null-значение.
     */
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                cashRegister += product.getPrice();
                return product;
            }
        }
        return null;
    }

    /**
     * Перегруженный метод.
     *
     * @param name   название напитка.
     * @param volume объём напитка.
     * @param temp   температура напитка.
     * @return Возвращает горячий напиток или null-значение.
     */
    public HotBeverage getProduct(String name, int volume, int temp) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((HotBeverage) product).getVolume() == volume && ((HotBeverage) product).getTemp() == temp) {
                cashRegister += product.getPrice();
                return (HotBeverage)product;
            }
        }
        return null;
    }

    public void add(HotBeverage hb) {
        productList.add(hb);
    }
}
