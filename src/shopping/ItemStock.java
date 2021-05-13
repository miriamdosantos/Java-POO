/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author miriam
 */
public class ItemStock extends Item {
    // define that the class ItemStock
    private int amount; 
   
    // reference of the class
    public ItemStock ( String name, double price, int amount){
        super (name, price); 
        this.amount = amount;
    }
    
    public int getAmount (){
       return amount;
    }
    // method to calculate what has in the amount less the amout from the user
    public void removeFromStock (int amountUser){
        amount -= amountUser;
    }
   
}
