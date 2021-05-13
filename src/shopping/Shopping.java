/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this is myBag. here can buy things to put in it
        ShoppingBag myBag = new ShoppingBag();
        // this is stock, here i can check my stock
        Stock stock = new Stock();

        // to get to input from the user
        Scanner scan = new Scanner(System.in);
        // print message
        System.out.println("Welcome to the shop");
        System.out.println("How can I help you? \n"
                + "1 -  Buy a item \n"
                + "0 - Leave Shop");
        // variable answer to reference the input from the user
        String answer = scan.nextLine();
        // theconditional when for anwer equals 1 then print line 31
        if (answer.equals("1")) {
            System.out.println("itens Available:");
            // print what have in the stock
            System.out.println(stock);
            System.out.println("0 - to exit");

            // this variable to stop the loop
            boolean leave = false;
            // start with do/while loop for print once line 38
            do {
                System.out.println("Which item do you want to buy?");
                // variable answer2 to storage the input from the user referes to line 38;
                String answer2 = scan.nextLine();
                // conditional if answer2 equal 0, then in the line 41 will be true, then leave the loop
                if (answer2.equals("0")) {
                    leave = true;
                    // if not answer2 equal 0 
                } else {
                    try {
                        // convert to a number
                        int id = Integer.parseInt(answer2);
                        // conditional to check if is the item in the stock, then print line 46
                        if (stock.checkItem(id)) {
                            System.out.println("How many item do you want to buy?");
                            // variable answer3 to store 
                            String answer3 = scan.nextLine();
                            // variable amount  to store the  variable asnwer3 convert to a number
                            int amount = Integer.parseInt(answer3);
                            // create the variable itemUser the type Item to store the methodo getItemById
                            Item itemUser = stock.getItemById(id, amount);
                            // them itemUser is going to myBag.buyItem
                            myBag.buyItem(itemUser);
                            // if is not print line 52
                        } else {
                            System.out.println("Invalid Item");
                        }
                    // try and catch if get a invalid option not match what are been expect
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Option");
                        // catch for don't have in the stock then print line 58
                    } catch (ItemUnavailable e) {
                        System.out.println("Amount greater than the stock available");
                    }

                }
                // stop the loop
            } while (!leave);
            // print the item of myBag
            System.out.println(myBag);
            // print the total of items
            System.out.println(myBag.totalPrice());

        }

    }

}
