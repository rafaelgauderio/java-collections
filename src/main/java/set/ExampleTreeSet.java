package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String [] args) {

        TreeSet<String> treeCapitals = new TreeSet<String>();

        //Assemble the tree with the capitals
        treeCapitals.add("Budapeste");
        treeCapitals.add("Paris");
        treeCapitals.add("Oslo");
        treeCapitals.add("Copenhagen");
        treeCapitals.add("Brasilia");
        treeCapitals.add("Roma");
        treeCapitals.add("Madrid");

        System.out.println(treeCapitals);

        //return the first capital at the top of the tree
        System.out.println("First: " + treeCapitals.first());

        //returns the last capital at the end of the tree
        System.out.println("Last: " + treeCapitals.last());

        // Returns the first capital below in the parameterized capital tree
        System.out.println("First below Paris: " + treeCapitals.lower("Paris"));

        // Returns the first capital above in the parameterized capital tree
        System.out.println("First above Paris: " + treeCapitals.higher("Paris"));

        // Display all capitals on console
        System.out.println("\n" + treeCapitals);

        // Returns the first capital at the top of the tree, removing from the set
        System.out.println("\n" + treeCapitals.pollFirst());

        // Returns the first capital at the end of the tree, removing from the set
        System.out.println("\n" + treeCapitals.pollLast());

        // Display all capitals on console
        System.out.println("\n" + treeCapitals +"\n");

        //navegate all iterator items

        Iterator<String> iterator = treeCapitals.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.print("\n");

        for (String capital: treeCapitals) {
            System.out.println(capital);
        }


    }
}
