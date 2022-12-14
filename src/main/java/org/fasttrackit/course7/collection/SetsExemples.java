package org.fasttrackit.course7.collection;

import org.fasttrackit.course7.model.Phone;
import org.fasttrackit.course7.model.PhoneNew;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsExemples {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();
        books.add("Luceafarul");
        books.add("Baltagul");
        books.add("Morometii");
        System.out.println(books);// we have tree books

        books.add("Luceafarul");
        System.out.println(books);// we have also tree books

        //Hash Set of Dogs
        Phone ph1 = new Phone("Samsung","S10");
        Phone ph2 = new Phone("iPhone","X");
        Phone ph3 = new Phone("Huawai","P10");
        HashSet<Phone> phones = new HashSet<>();
        phones.add(ph1);
        phones.add(ph2);
        phones.add(ph3);
        System.out.println(phones);
        Phone ph4 = new Phone("iPhone","X");
        phones.add(ph4);
        System.out.println(phones);

        // Hash Set of Phones without Duplicates
        System.out.println(" \nPhones without duplicates");
        PhoneNew newPh1 = new PhoneNew("Alcatel", "110");
        PhoneNew newPh2 = new PhoneNew("Oppo", "X1");
        PhoneNew newPh3 = new PhoneNew("LG", "G7");

        HashSet<PhoneNew> phonesWithoutDupl = new HashSet<>();
        phonesWithoutDupl.add(newPh1);
        phonesWithoutDupl.add(newPh2);
        phonesWithoutDupl.add(newPh3);
        System.out.println(phonesWithoutDupl);

        PhoneNew newPh4 = new PhoneNew("LG", "G7");
        phonesWithoutDupl.add(newPh4);
        System.out.println(phonesWithoutDupl);

        // Tree Set of Strings with music albums
        System.out.println(" \nSingers in alphabetical order");
        TreeSet<String> singers = new TreeSet<>();
        singers.add("ZZ Top");
        singers.add("Fuego");
        singers.add("ABBA");
        singers.add("Freddy Mercury");
        singers.add("ABBA");
        System.out.println(singers);

        // Tree Set of Phones without sorting
        TreeSet<Phone> phonesSorted = new TreeSet<>();
        //phonesSorted.add(new Phone("Nokia", "7.1")); // ClassCastException, not Comparable
    }
}