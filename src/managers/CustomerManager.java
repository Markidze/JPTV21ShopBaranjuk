/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import java.util.Scanner;
public class CustomerManager {
    private Scanner scanner;
    public CustomerManager() {
        this.scanner = new Scanner(System.in);
    }
    public Customer createCustomer(){
    Customer Customer = new Customer();
    System.out.println("Customer name");
    Customer.setFirstname(scanner.nextLine());
    System.out.println("Pokupatel lastname");
    Customer.setLastname(scanner.nextLine());    
    System.out.println("Pokupatel cash");
    Customer.setMoney(scanner.nextInt());
    
    return Customer;
    }
    void printListCustomer(Customer[] customer) {
        for(int i = 0; i < customer.length; i++){
            Customer Customer = customer[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,Customer.getFirstname()
                    ,Customer.getLastname()
                    ,Customer.getPhone()
                    ,Customer.getMoney());
                    
        }
    }
}