import java.util.ArrayList;
import java.util.List;

public class WaterBattleVendingMachine implements VendingMachine {

    private final List<Product> productList = new ArrayList<>();

    private double cashRegister = 0;

    public WaterBattleVendingMachine() {
        this.productList.add(new BottleOfWater("Вода", 0.59, 500));
        this.productList.add(new BottleOfWater("Вода газированная", 0.79, 500));
        this.productList.add(new BottleOfWater("Кола", 0.99, 500));
        this.productList.add(new BottleOfWater("Лимонад", 0.69, 500));
    }

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

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume) {
                    cashRegister += product.getPrice();
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }


}
