package Worksheet_4;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
	    int[] nValues = {10, 100, 1000, 10000};

	    for (int n : nValues) {
	        // Create an ArrayList and a LinkedList
	        ArrayList<Coordinate> arrayList = new ArrayList<>();
	        Linked_List<Coordinate> linkedList = new Linked_List<>();

	        // Insert n random coordinate points into the ArrayList and the LinkedList
	        Random random = new Random();
	        for (int i = 0; i < n; i++) {
	            int x = random.nextInt(100);
	            int y = random.nextInt(100);

	            arrayList.add(new Coordinate(x, y));
	            linkedList.addNode(new Node<>(new Coordinate(x, y)));
	        }

	        // Measure the execution time for the ArrayList
	        long startTimeA = System.nanoTime();

	        for (int i = 0; i < n; i++) {
	            int p = random.nextInt(n);
	            int q = random.nextInt(n);

	            Coordinate tempA = arrayList.get(p);
	            arrayList.set(p, arrayList.get(q));
	            arrayList.set(q, tempA);
	        }

	        long endTimeA = System.nanoTime();
	        long timeA = endTimeA - startTimeA;

	        // Measure the execution time for the LinkedList
	        long startTimeB = System.nanoTime();

	        Node<Coordinate> current = linkedList.head;
	        while (current != null) {
	            int p = random.nextInt(n);
	            int q = random.nextInt(n);

	            Coordinate tempB = current.info;
	            current.info = linkedList.getNodeAt(p).info;
	            linkedList.getNodeAt(p).info = tempB;

	            current = current.next;
	        }

	        long endTimeB = System.nanoTime();
	        long timeB = endTimeB - startTimeB;

	        // Print out the values of Time_A and Time_B
	        System.out.println("N = " + n);
	        System.out.println("Time_A (ArrayList): " + timeA);
	        System.out.println("Time_B (LinkedList): " + timeB);
	        System.out.println();
	    }
	}	    
}
