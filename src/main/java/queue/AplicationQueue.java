package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AplicationQueue {

    public static void main(String [] args) {

        System.out.println("Secure the order of insertions.\n" +
                "Allows adding, reading and removing.\n" +
                "FIFO: First in, Firts out\n" +
                "Does not allow ordering change.\n");

        Queue<String> rowBank = new LinkedList<>();

        //Adding five elementos to the queue
        rowBank.add("Rafael");
        rowBank.add("Luciana");
        rowBank.add("Atila");
        rowBank.add("Mary");
        rowBank.add("Peter");
        //Printing the list
        System.out.println(rowBank);

        //returns the first onde in the list, but doesn´t remove
        String firstInQueue = rowBank.peek();
        System.out.println("firstInQueue: "+firstInQueue);
        System.out.println(rowBank);

        //Returns the first one in the list, removing
        String FirstInQueueRemoved =  rowBank.poll();
        System.out.println("FirstInQueueRemoved: " +FirstInQueueRemoved);
        System.out.println(rowBank);

        System.out.println("\nQueue size: " + rowBank.size());

        //Browses all items in the queue
        for (String nextInQueue : rowBank) {
            System.out.println(nextInQueue);
        }

        rowBank.add("John");
        rowBank.remove("Luciana");

        System.out.println("\n");

        //Browse all items in the queue using iterator
        Iterator<String> iterator = rowBank.iterator();
        while( iterator.hasNext()) {
            System.out.println(iterator.next());
        }










    }


}
