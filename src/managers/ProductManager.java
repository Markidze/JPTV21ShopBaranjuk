
package managers;

import entity.Product;
import java.util.Scanner;


public class ProductManager {
    private Scanner scanner;

    public ProductManager() {
        scanner = new Scanner(System.in);
    }

    public Product addProduct() {
        Product product = new Product();
        System.out.println("Введите название продукта: ");
        product.setName(scanner.nextLine());
        System.out.println("Введите цену продукта: ");
        product.setPrice(scanner.nextInt());
        System.out.println("Введите количество товара: ");
        product.setQuantity(scanner.nextInt());
        return product;
    }

    public void printListProducts(Product[] products){
        System.out.println("Продукты: ");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(i+1+". "+product.getName()+" "+product.getPrice()+"€");
        }
        System.out.println();
    }

}