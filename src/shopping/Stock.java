/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miriam
 */
public class Stock {

    // create one list of type ItemStock name items criando uma list importanda da classe item 
    private List<ItemStock> items;

    // method Stock
    public Stock() {
        // intantiate a new ArrayList, building the object 
        items = new ArrayList<>();
        // here the object 1 is create as item1, using the methodo addItem to create items of list
        addItem("Shoes", 150.00, 8);
        addItem("Heels", 250.99, 12);
        addItem("Flat", 25.99, 15);

    }

    // method addItem
    private void addItem(String name, double price, int amount) {
        // create object with the parameter name, price, amout
        ItemStock itemStock1 = new ItemStock(name, price, amount);
        //  here will add itemStock1 
        items.add(itemStock1);

    }

    // methodo getItemById
    public Item getItemById(int id, int amount) throws ItemUnavailable {
        // type ItemStock to acess the id in the position 
        ItemStock itemStock = items.get(id - 1);
        // conditional to check if the amount is less that what has in the itemStock trough getAmout
        if (amount <= itemStock.getAmount()) {
            // if line 38 true, remove this amount from Stock
            itemStock.removeFromStock(amount);
            return itemStock;
            // if not
        } else {
            throw new ItemUnavailable();

        }

    }

    public boolean checkItem(int id) { // method checkItem
        if (id > items.size()) { // to check if the Id is bigger then the size that its is items
            return false; // than return false
        } else { // or return true
            return true;
        }
    }

    public String toString() { // method toString to return a text before 
        String string = ""; // instantiate the string
        int i = 1; // instantiate the i
        for (ItemStock itemStock : items) { // for  create a counter i that start 1 until i < item.size
            String itemName = itemStock.getName(); // recover get.name into the variable itemName 
            string += i + " - " + itemName + " " + itemStock.getPrice() + " \n"; // here its possible to print 1- ande the name of the item by the item by item 
            i++;// increase
        }
        return string; // give a return
    }
}
