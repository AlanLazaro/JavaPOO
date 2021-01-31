package com.company;

public class Main {

    public static void main(String[] args) {

       Video v = new Video("First Video");
       User p = new User("Alan", 20, "M", "AlanTSL");

       Visualizacao view = new Visualizacao(p,v);

       view.avaliar(7);
       view.avaliar(7);
       view.avaliar(7);

        System.out.println(view.toString());
    }
}
