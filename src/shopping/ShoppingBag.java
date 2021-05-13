/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.ArrayList;

/**
 * A simple ShoppingBag
 * 
 * Stores items in an ArrayList
 * 
 * Possible to add  items
 * Also can "empty" the bag
 * 
 * You should NOT need to amend this code at all!
 * 
 * @author Ken
 */
public class ShoppingBag {
    
    private ArrayList<Item> items;
    
    /**
     * Create a shopping bag by initialising the items to an empty arraylist
     */
    public ShoppingBag(){
        
        items = new ArrayList<Item>();
    }
    
    /**
     * Add an item to the shopping bag
     * @param someItem the item that has been bought
     */
    public void buyItem(Item someItem){
        
        this.items.add(someItem);
    }
    
 
    /**
     * create a formatted String containing all the items in the ShoppingBag
     * @return the formatted String
     * Also clears the items list
     */
    public String emptyBag(){
        
        String itemList = "";
        
        for(Item item: this.items){
            
            itemList = itemList + item.toString() + "\n";
        }
        
        this.items.clear();
        
        return itemList;
    }
    
    public double totalPrice (){
       ;
        double total = 0;
        for (Item item: this.items){
            total += item.getPrice();
            
        }
        
        return total;
        
    }
    
    public String toString (){
        String toString = "";
        for (Item item: items ){
        
         toString += " " + item.getName() + " " + item.getPrice();
        }
        return toString;
    }
}
