package BT1.service;

import BT1.model.Product;
import BT1.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "san pham 1", 10));
        productList.add(new Product(2, "san pham 2", 20));
        productList.add(new Product(3, "san pham 3", 30));


    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
//        boolean checkId = true;
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.get(i).getProductId()==product.getId()) {
//                productList.set(i, product);
//                checkId = false;
//            }
//        }
//        if (checkId) {
//            productList.add(product);
//        }


        if (findById(product.getProductId())==null) {
            productList.add(product);
        } else {
            int index = productList.indexOf(findById(product.getProductId()));
            productList.set(index,product);
        }
    }

    @Override
    public Product findById(int productId) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == productId)
                return productList.get(i);
        }
        return null;
    }
    public int findMaxId() {
        int max = productList.get(0).getProductId();
        for (int i = 0; i < productList.size(); i++) {
            if (max < productList.get(i).getProductId()) {
                max = productList.get(i).getProductId();
            }
        }
        return max;
    }


    @Override
    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId() == id)
                productList.remove(i);
        }
    }
}
