package org.fasttrackit.course7.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExemple {

     public static void main(String[] args) {
        // array
        String[] carsArray = new String[2];
        carsArray[0]= "new car";
        carsArray[1]= "another car";
        //carsArray[2]= "old car";// arrayIndexOutOfBoundsException

        //arrayList

//ArrayList<String> carsArrayList = new ArrayList<>();
         System.out.println( " \n Array Lists");
List<String>carsArrayList = new ArrayList<>();
carsArrayList.add("Mihnea's Dacia Logan");
carsArrayList.add("Ramona's Audi");
carsArrayList.add("Elon Musk Tesla");
         System.out.println(carsArrayList.get(0));// read
         carsArrayList.remove(0);// delete
         System.out.println(carsArrayList.get(0));//read


         // Linked List
         System.out.println("\n Linked List");
         LinkedList<String>tractorLinkedList = new LinkedList<>();
         tractorLinkedList.add("John Deere");
         tractorLinkedList.add("ARO");
         System.out.println(tractorLinkedList);
         tractorLinkedList.addFirst("Lamborghini");
         System.out.println(tractorLinkedList);
         tractorLinkedList.addLast("Ford");
         System.out.println(tractorLinkedList);
         /**
          * FIFO vs LIFO
          * FIFO (coada, queue): first-in, first-out
          * - example: store queues for paying
          *
          * LIFO (stiva, stack): last-in, first-out
          * - example: stack of objects, like the Tower of Hanoi
          */
    }
}
