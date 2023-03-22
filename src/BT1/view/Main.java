package BT1.view;

import BT1.config.Config;

public class Main {
    public Main() {
        System.out.println("*****************PRODUCT_MANAGE***************");
        System.out.println("1. Show list Product");
        System.out.println("2. Create new Product");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Sort Product by price");
        System.out.println("6. Sort Product by name");
        System.out.println("7. Search Product by name");


        int chooseMenu = Integer.parseInt(Config.scanner().nextLine());
        switch (chooseMenu) {
            case 1:
                new ProductView().showAllProduct();
                break;
            case 2:
                new ProductView().createProduct();
                break;
            case 3:
                new ProductView().updateProduct();
                break;
            case 4:
                new ProductView().deleteProduct();
                break;
            case 5:
                new ProductView().sortByPrice();
                break;
            case 6:
                new ProductView().sortByName();
                break;
            case 7:
                new ProductView().searchByName();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
