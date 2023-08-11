package CollectionFramework.ArrayList.Hashset;

import java.util.HashSet;

public class HashsetExamp {
    public void displayHashSet(){
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Virinchi");
        hashset.add("Kist");
        hashset.add("Nccs");
        System.out.println("After adding to hashset "+hashset);
        hashset.remove("Kist");
        System.out.println("After removing hashset " +hashset);
    }
}
