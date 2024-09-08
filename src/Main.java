
public class Main {
    public static void main(String[] args) {

        // Инициализация нескольких ГорячихНапитков и ГорячихНапитковАвтомат согласно ТЗ.
        HotBeverage hb = new HotBeverage("Напиток1", 1, 1, 1);
        HotBeverage hb1 = new HotBeverage("Напиток2", 1, 1, 1);
        HotBeverageVendingMachine vm1 = new HotBeverageVendingMachine();


        HotBeverageVendingMachine vm = new HotBeverageVendingMachine();

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