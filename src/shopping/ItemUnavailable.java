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
public class ItemUnavailable extends Exception {

    public ItemUnavailable() {
        super("Item Unavailable, pick a different amount");
    }

    void printError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
