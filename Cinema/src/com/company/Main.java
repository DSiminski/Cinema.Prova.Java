package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        com.company.Sessões s1 = new com.company.Sessões(1," ABC- 1", true);
        com.company.Sessões s2 = new com.company.Sessões(2, "DEF-2 ",true);

        System.out.println(s1);
        System.out.println(s2);

        com.company.Filmes f1 = new com.company.Filmes(1, " Classificação livre para todas as idades");
        f1.getTitulos().add(s1);
        f1.getTitulos().add(s2);
        System.out.println(f1);


    }
}
