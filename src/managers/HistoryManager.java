/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Product;
import entity.History;
import entity.Customer;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.stream.IntStream;


public class HistoryManager {
private final Scanner scanner;
public static int totalSumma;
int history[];
public History history1;
public History revenue;
public int quan;
public int numberQuantity;

    public HistoryManager() {
        scanner = new Scanner(System.in);
        history = new int[0];
        history1 = new History();
        
    }
    
    public History takeOnProduct(Product[] products, Customer[] customers){
        System.out.println("Список покупателей: ");
        for (int i = 0; i < customers.length; i++) {
            System.out.println(i+1+"."+customers[i].getFirstname()+" "+customers[i].getLastname());
        }
        System.out.print("Выбери покупателя: ");
        int numberCustomer = scanner.nextInt(); scanner.nextLine();
        System.out.println("Список продуктов: ");
        for (int i = 0; i < products.length; i++) {
            System.out.print(i+1+". "+products[i].getName()+". ");
            }
            System.out.println();
        
        System.out.print("Выбери продукт: ");
        int numberProduct = scanner.nextInt();scanner.nextLine();
        System.out.println("Выберите количество: ");
        numberQuantity = scanner.nextInt();
        
        history1.setProduct(products[numberProduct - 1]);
        history1.setCustomer(customers[numberCustomer-1]);
        history1.setTakeOnProduct(new GregorianCalendar().getTime());
        quan = history1.getProduct().getQuantity() - numberQuantity;
        products[numberProduct-1].setQuantity(quan);
        int purchase = customers[numberCustomer-1].getMoney()- products[numberProduct-1].getPrice()*numberQuantity;
        customers[numberProduct-1].setMoney(purchase);
        totalSumma = products[numberProduct-1].getPrice();
        this.history = Arrays.copyOf(this.history, this.history.length+1);
        this.history[this.history.length-1] = products[numberProduct-1].getPrice();
        history1.setProductPriceHistory(String.valueOf(totalSumma));
        return history1;
    }
     public int getProfite(History[] histories) { 
        int sum = 0;
        for (int i = 0; i < histories.length; i++) {
            history1 = histories[i];
            sum += history1.getProduct().getPrice()*numberQuantity;
        }
        return sum;
     }
}
     
