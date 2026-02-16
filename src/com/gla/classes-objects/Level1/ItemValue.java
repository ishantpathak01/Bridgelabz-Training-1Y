package com.gla.classes-objects.Level1;
import java.util.Scanner;
class ItemValue{
    int itemCode;
    String itemName;
    double price;

    void display(int quantity) {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
}

public class Main {
    public static void main(String[] args) {
        Item i = new Item();

        i.itemCode = 201;
        i.itemName = "Pen";
        i.price = 10;

        i.display(5);
    }
}
