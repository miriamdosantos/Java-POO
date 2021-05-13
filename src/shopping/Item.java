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
public class Item {
    // define that the class Item is instacialize by a parameter name 
    private String name;
    // define that the class Item is instacialize by a parameter PRICE
    private double price; 

    // to define that this is refer to this class
    public Item (String name, double price){ // 
        this.name = name; 
        this.price = price;
    }
    
    // create a method getPrice for when wants to return the price 
    public double getPrice (){
        return price;
    }
    
    // create a method getName fo when wants to return the name
    public String getName() {  
        return name;
    }
}
