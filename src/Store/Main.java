package Store;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    List<items> StoreAitems = Arrays.asList(new items("Milk",20,17),new items("Eggs",70,60));
    List<items> StoreBitems = Arrays.asList(new items("Eggs",20,17),new items("Eggs",70,60));
    List<stores> Kstore = Arrays.asList(new stores("StoreA", StoreAitems),
                                        new stores("StoreB", StoreBitems));

    for(stores store:Kstore){
        System.out.println(store.Sname);

        for(items Sitem :store.item){

            if(Sitem.stock - Sitem.sell < 5){
                System.out.print(Sitem.name+"   "+"Remaining :" + (Sitem.stock - Sitem.sell));
            }

        }
        
        System.out.println();

    }
    }
}
