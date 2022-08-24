package org.fasttrackit.course7.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapsExemple {
    public static void main(String[] args) {
        HashMap<String, String> doom2 = new HashMap<>();
        doom2.put("pinguin"," Un animal care traieste in zone reci");
        doom2.put("albina"," Face buzz buzz");
        doom2.put("crisalida"," Mai tarziu devine fluture");
        System.out.println(doom2);
        System.out.println("\n Afisarea valorii pentru cheaia \" albina\"");
        System.out.println(doom2.get("albina"));

        HashMap<String, List<String>> doomMultipleDefs = new HashMap<>();
        List<String> defsForBroasca = new ArrayList<>();
        defsForBroasca.add("Amimal pe care-l mananca francezii");
        defsForBroasca.add("Element al usii");
        doomMultipleDefs.put("broasca",defsForBroasca);

        List<String> defsForCheie = new ArrayList<>();
        defsForCheie.add("Cheia de la usa");
        defsForCheie.add("Cheia sol");
        defsForCheie.add("Cheie franceza");
        doomMultipleDefs.put("cheie",defsForCheie);

        System.out.println(doomMultipleDefs);
        System.out.println("\n Afisarea definitiilor pentru cheie");
        System.out.println(doomMultipleDefs.get("cheie"));
        List<String> newDefsForBroasca = new ArrayList<>();
        newDefsForBroasca.add("Animal din lac");
        doomMultipleDefs.put("broasca", newDefsForBroasca);
        System.out.println(" \n Afisare DOOM cu cheia \"broasca\" actualizata cu PUT.");
        System.out.println(doomMultipleDefs);

        List<String> broascaDefsFromDoom = doomMultipleDefs.get("broasca");
        broascaDefsFromDoom.add("ce definitie noua mai vrem noi");
        System.out.println(" \n Afisare DOOM cu cheia \"broasca\" actualizata cu GET + ADD. (can be null)");
        System.out.println(doomMultipleDefs);

        System.out.println(doomMultipleDefs.get("yala"));



    }
}
