package BT1.service;

import BT1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    public int findMaxId();
    void deleteById(int id);
}
