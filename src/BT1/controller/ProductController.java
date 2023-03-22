package BT1.controller;

import BT1.model.Product;
import BT1.service.IProductService;
import BT1.service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    IProductService productService = new ProductServiceIMPL();

    public List<Product> showListProduct() {
        return productService.findAll();
    }

    public void creatProduct(Product product) {
        productService.save(product);
    }

    public void deleteProduct(int productId) {
        productService.deleteById(productId);
    }
    public int setProductId(){
      return   productService.findMaxId();
    }
}
