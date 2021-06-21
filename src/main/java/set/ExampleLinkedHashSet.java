package set;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {

    public static void main (String [] args) {

        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<Integer>();

        //add number to the set
        numericalSequence.add(64);
        numericalSequence.add(16);
        numericalSequence.add(1);
        numericalSequence.add(4);
        numericalSequence.add(2);
        numericalSequence.add(8);
        numericalSequence.add(32);
        numericalSequence.add(64);

        System.out.println(numericalSequence);

        //remove the set number
        numericalSequence.remove(0);
        numericalSequence.remove(32);

        System.out.println("\nprint after remove item 32: " + numericalSequence);

        System.out.println("Size of LinkedHashSet: "+numericalSequence.size());
        System.out.print("\n");

        //Navigate and print all iterator items
        Iterator<Integer> iterator = numericalSequence.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.print("\n");

        for(Integer number:numericalSequence) {
            System.out.println(number);
        }

        numericalSequence.clear();

        //return if the set is empty or not
        System.out.print("\nNumerical Sequence is empty? " + numericalSequence.isEmpty());








    }
}
