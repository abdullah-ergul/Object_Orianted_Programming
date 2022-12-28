package BEng_2_1_KasimOzacar.week11_Java_Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


class Item {
    int num;
    String name;

    Item(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + this.name;
    }
}


public class ArrayLists {
    // ! MAIN SECTION
    public static void main(String[] args) {
        // Collection collection = new ArrayList();
        Collection<Item> collection = new ArrayList<>();

        // collection.add(15);
        // collection.add("Merhaba");
        Item item1 = new Item(1, "Pen");
        Item item2 = new Item(2, "Erasor");
        Item item3 = new Item(3, "Pencil");
        Item item4 = new Item(4, "Notebook");
        collection.add(item1);
        collection.add(item2);
        collection.add(item3);
        collection.add(item4);

        Iterator<Item> iterator = collection.iterator();

        for (Object o: collection) {
            System.out.println(o.toString());
            iterator.remove();
        }
    }
    // ! MAIN SECTION
}
