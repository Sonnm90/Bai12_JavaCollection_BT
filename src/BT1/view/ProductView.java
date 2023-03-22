package BT1.view;

import BT1.config.Config;
import BT1.controller.ProductController;
import BT1.model.Product;
import BT1.view.Main;

import java.util.Collections;
import java.util.List;

public class ProductView {
    ProductController productController = new ProductController();

    public void showAllProduct() {
        System.out.println("**********PRODUCT_MANAGE**********");
        List<Product> productList = productController.showListProduct();
        System.out.println("---STT---ID---NAME---PRICE---");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("   " + (i + 1) + "   " + productList.get(i).getProductId() + "   " + productList.get(i).getProductName() + "   " + productList.get(i).getPrice());
        }
        System.out.println("Enter back to comeback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void createProduct() {
        boolean cont = true;
        do {
            int productId = productController.setProductId() + 1;
            System.out.println("Enter name of Product");
            String productName = Config.scanner().nextLine();
            System.out.println("Enter price of Product");
            int price = Integer.parseInt(Config.scanner().nextLine());
            Product product = new Product(productId, productName, price);
            productController.creatProduct(product);
            System.out.println("Creat Success");
            System.out.println("Enter any key to create new Product or back to comeback Menu");
            String backMenu = Config.scanner().nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new Main();
                cont = false;
            }
        } while (cont);
    }

    public void deleteProduct() {
        while (true) {
            System.out.println("Enter id of Product to delete");
            int deleteId = Integer.parseInt(Config.scanner().nextLine());
            productController.deleteProduct(deleteId);
            System.out.println("Enter any key to continue delete Product or back to comeback Menu");
            String backMenu = Config.scanner().nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new Main();
                break;
            }
        }
    }

    public void updateProduct() {
        while (true) {
            System.out.println("Enter Id to update");
            int updateId = Integer.parseInt(Config.scanner().nextLine());
            System.out.println("Enter new name of Product");
            String updateName = Config.scanner().nextLine();
            System.out.println("Enter new price of Product");
            int updateAge = Integer.parseInt(Config.scanner().nextLine());
            Product product = new Product(updateId, updateName, updateAge);
            productController.creatProduct(product);
            System.out.println("Enter any key to update  Product or back to comeback Menu");
            String backMenu = Config.scanner().nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new Main();
                break;
            }
        }
    }

    public void sortByPrice() {
        System.out.println("**********PRODUCT_MANAGE**********");
        List<Product> productList = productController.showListProduct();
        Collections.sort(productList);
        System.out.println("---STT---ID---NAME---PRICE---");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("   " + (i + 1) + "   " + productList.get(i).getProductId() + "   " + productList.get(i).getProductName() + "   " + productList.get(i).getPrice());
        }
        System.out.println("Enter back to comeback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void sortByName() {
        List<Product> productList = productController.showListProduct();
        Collections.sort(productList, Product.ProductNameComparator);
        System.out.println("**********PRODUCT_MANAGE**********");
        System.out.println("---STT---ID---NAME---PRICE---");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("   " + (i + 1) + "   " + productList.get(i).getProductId() + "   " + productList.get(i).getProductName() + "   " + productList.get(i).getPrice());
        }
        System.out.println("Enter back to comeback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void searchByName() {
        List<Product> productList = productController.showListProduct();
        System.out.println("Enter name of product to search:");
        String searchName = Config.scanner().nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().contains(searchName)) {
                System.out.println(productList.get(i).toString());
            }
        }
        System.out.println("Enter back to comeback Menu");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }


}
