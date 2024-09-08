//package Draft;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class VendingMachine {
//    private final List<Product> storage = new ArrayList<Product>(); // хранилище товаров
//    private double cashRegister = 0; // касса
//
//    /**
//     * Конструктор.
//     */
//    public VendingMachine() {
//        initProducts();
//    }
//
//    /**
//     * Метод инициализации изначального списка товаров.
//     */
//    private void initProducts() {
//        storage.add(new Product("Lay's", 1.99));
//        storage.add(new Product("Dr.Paper", 0.59));
//        storage.add(new Product("Сыр моцарелла", 3.99));
//        storage.add(new Product("Апельсиновый сок", 2.99));
//        storage.add(new Product("Lay's", 3.59));
//        storage.add(new Product("Кола", 0.59));
//        storage.add(new Product("Шоколад", 2.99));
//    }
//
//    /**
//     * Метод покупки из торгового автомата.
//     * После покупки стоимость прибавляется в кассу,
//     * а сам товар удаляется из хранилища.
//     * @param name название товара.
//     * @param price цена товара.
//     */
//    public void bueProduct(String name, double price) {
//        Product product;
//        boolean isSold = false;
//        for (int i = 0; i < storage.size() && !isSold; i++) {
//            product = storage.get(i);
//            if (product.getName().equals(name) && product.getPrice() == price) {
//                storage.remove(i);
//                i--;
//                System.out.println("Продано:");
//                product.print();
//                cashRegister += price;
//                isSold = true;
//            }
//        }
//        if (!isSold) {
//            System.out.println("Товар не найден.");
//        }
//    }
//
//    /**
//     * Метод покупки из торгового автомата.
//     * После покупки стоимость прибавляется в кассу,
//     * а сам товар удаляется из хранилища.
//     * @param name название товара.
//     */
//    public void bueProduct(String name) {
//        Product product;
//        boolean isSold = false;
//        for (int i = 0; i < storage.size() && !isSold; i++) {
//            product = storage.get(i);
//            if (product.getName().equals(name)) {
//                storage.remove(i);
//                i--;
//                System.out.println("Продано:");
//                product.print();
//                cashRegister += product.getPrice();
//                isSold = true;
//            }
//        }
//        if (!isSold) {
//            System.out.println("Товар не найден.");
//        }
//    }
//
//    /**
//     * Метод для просмотра денег в кассе.
//     */
//    public void showCashRegister() {
//        System.out.println("Касса: " + cashRegister);
//    }
//
//    /**
//     * Напечатать весь ассортимент.
//     */
//    public void showAllStorage() {
//        print(storage);
//    }
//
//    /**
//     * Метод печатает товары, найденные по названию.
//     * @param name название, по которому нужно найти товар.
//     */
//    public void showProduct(String name) {
//        print(getProduct(name));
//    }
//
//    /**
//     * Метод для добавления товара в хранилище.
//     * @param name название товара.
//     * @param price цена товара.
//     */
//    public void addProducts(String name, double price) {
//        storage.add(new Product(name, price));
//    }
//
//    /**
//     * Метод для просмотра товара.
//     * Возвращает коллекцию товаров найденных по имени.
//     * @param name название товара.
//     */
//    public List<Product> getProduct(String name) {
//        List<Product> result = new ArrayList<>();
//        for (Product product : storage) {
//            if (name.equals(product.getName())) {
//                result.add(product);
//            }
//        }
//        return result;
//    }
//
//    /**
//     * Метод для печати товаров, чтобы их можно было просмотреть.
//     * Принимает ArrayList наполненный товарами.
//     * Если лист пустой, то напечатается соответсвующее сообщение.
//     * @param result коллекция для печати.
//     */
//    private void print(List<Product> result) {
//        if (result.isEmpty()) {
//            System.out.println("Товар не найден.");
//        } else {
//            for (Product product : result) {
//                product.print();
//            }
//        }
//    }
//}
