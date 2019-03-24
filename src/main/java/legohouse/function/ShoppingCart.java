/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.function;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fskn
 */
public class ShoppingCart {
    
    List <House> orders = new ArrayList();
    
    public void addToList(House house)
    {
        orders.add(house);
    }
    
    public List returnListOfOrders()
    {
        return orders;
    }
    
}
