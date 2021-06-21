package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

    public static void main (String [] args) {

        Set<Double> studentsGrades = new HashSet<>();

        //add the grades to the set
        studentsGrades.add(5.9);
        studentsGrades.add(7.5);
        studentsGrades.add(8.3);
        studentsGrades.add(10.0);
        studentsGrades.add(9.3);
        studentsGrades.add(3.6);
        studentsGrades.add(4.5);
        studentsGrades.add(6.0);
        studentsGrades.add(7.2);

        System.out.println(studentsGrades);

        //Remove a grade from set

        studentsGrades.remove(7.5);

        System.out.println("Remove 7.5 grade: " + studentsGrades);

        //return the number of items in the set
        System.out.println("\nSize: "+ studentsGrades.size());

        //Navigate and print all the iterator items
        Iterator<Double> iterator = studentsGrades.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.print("\n");

        for (Double grade : studentsGrades) {
            System.out.println(grade);
        }

        //clear the set type list
        studentsGrades.clear();

        //return if the set is empty or not
        System.out.println(studentsGrades.isEmpty());








    }

}
