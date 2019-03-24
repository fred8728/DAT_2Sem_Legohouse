/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.function;

/**
 *
 * @author fskn
 */
public class Order {
    
    private int id;
    private int height;
    private int length;
    private int width;

    public Order(int id, int height, int length, int width) {
        this.id = id;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", height=" + height + ", length=" + length + ", width=" + width + '}';
    }
    
    
    
}
