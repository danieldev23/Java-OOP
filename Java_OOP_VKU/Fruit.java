/*
 *      Created at: 10/30/23, 10:33 PM
 *      Author: Đặng Quốc Huy (Huy Daniel)
 *      Github: https://github.com/danieldev23
 *      Facebook: https://facebook.com/huycoder2k5
 *
 *
 *
 */

package java_oop_vku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface IFruit {
    double priceForSale();
}

class Fruit implements IFruit{

    int id;
    String name;
    double price;

    public Fruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public double priceForSale() {
        return price;
    }
}




class FruitList {

    List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit f) {
        fruits.add(f);
    }

    public void printFruits() {
        for (Fruit f : fruits) {
            System.out.println(f.id + " " + f.name + " " + f.price);
        }
    }

    public void printFruitsAbovePrice(double price) {
        for (Fruit f : fruits) {
            if (f.priceForSale() > price) {
                System.out.println(f.id + " " + f.name + " " + f.priceForSale());
            }
        }
    }

    public int getTotalFruits() {
        return fruits.size();
    }
}

