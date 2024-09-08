
public class Main {
    public static void main(String[] args) {

        // Инициализация нескольких ГорячихНапитков и ГорячихНапитковАвтомат согласно ТЗ.
        HotBeverageVendingMachine vm = new HotBeverageVendingMachine();

        HotBeverage hb = new HotBeverage("Латте", 0.99, 500, 90);
        HotBeverage hb1 = new HotBeverage("Глинтвейн", 1.99, 450, 85);

        vm.add(hb);
        vm.add(hb1);

        System.out.println("override");
        printProduct(vm.getProduct("Чай"));

        System.out.println("\noverload");
        printProduct(vm.getProduct("Какао", 600, 90));

        System.out.println("\nnull value");
        printProduct(vm.getProduct("Кофе", 400, 80));

    }

    /**
     * Печатает экземпляр класса Product и его наследников. Обрабатывает null-значение.
     * @param product принимаемый экземпляр класса.
     */
    public static void printProduct(Product product) {
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Продукт не найден.");
        }
    }
}