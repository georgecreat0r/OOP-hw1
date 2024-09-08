// Задача 1 - Абстракция
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts(List<Product>) сохраняющий в себе список исходных продуктов и getProduct(String name).

// Задача 2 - Инкапсуляция
// Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
// сделанного в предыдущем задании.

// Задача 3 - Наследование
// Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
// сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

// Задача 4 - Полиморфизм
// Переопределите метод toString для Товара, запустите программу, после этого переопределите для
// наследника этот метод, после запуска обратите внимание на изменение поведения.

// Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
// входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
// возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)

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