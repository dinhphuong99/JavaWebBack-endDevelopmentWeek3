package service;

import model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "sugar", 15000, "Hanoi"));
        products.put(2, new Product(2, "fresh milk", 200000, "Danang"));
        products.put(3, new Product(3, "salt", 2000, "Saigon"));
        products.put(4, new Product(4, "water spinach", 5000, "Beijin"));
        products.put(5, new Product(5, "apple", 30000, "Miami"));
        products.put(6, new Product(6, "beef", 100000, "Newyork"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product customer) {
        products.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        products.put(id, customer);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public Product findName(String name) {
        return products.get(name);
    }

    public static List<Product> searchProductWithName() {
        Map<Integer, Product> searchProduct;
        return new ArrayList<>(products.values());
    }

    public static Map<Integer, Product> getMap(){
        return products;
    }
}