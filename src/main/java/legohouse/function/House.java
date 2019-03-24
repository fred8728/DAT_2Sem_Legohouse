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
public class House {
    
    private int height;
    private int length;
    private int width;
    private int twoXfour;
    private int twoXtwo;
    private int oneXtwo;

    public House(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
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

    public int getTwoXfour() {
        return twoXfour;
    }

    public void setTwoXfour(int twoXfour) {
        this.twoXfour = twoXfour;
    }

    public int getTwoXtwo() {
        return twoXtwo;
    }

    public void setTwoXtwo(int twoXtwo) {
        this.twoXtwo = twoXtwo;
    }

    public int getOneXtwo() {
        return oneXtwo;
    }

    public void setOneXtwo(int oneXtwo) {
        this.oneXtwo = oneXtwo;
    }

    @Override
    public String toString() {
        return "House{" + "height=" + height + ", length=" + length + ", width=" + width + ", twoXfour=" + twoXfour + ", twoXtwo=" + twoXtwo + ", oneXtwo=" + oneXtwo + '}';
    }
    
    
}
