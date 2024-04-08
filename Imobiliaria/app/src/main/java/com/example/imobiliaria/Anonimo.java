package com.example.imobiliaria;

interface Pessoa {
    public void falar();
}

public class Anonimo {
    public static void main(String[] args) {

        Pessoa p = new Pessoa() {
            @Override
            public void falar() {
                System.out.println("Chinês");
            }
        };

        p.falar();
    }
}

/*class Pessoa {
    public void falar () {
        System.out.println("Esperanto");
    }
}

public class Anonimo {
    public static void main(String[] args) {

        Pessoa p = new Pessoa() {
            @Override
            public void falar() {
                System.out.println ("Chines");
            }
        };

        p.falar();

        Pessoa p2 = new Pessoa();
        p2.falar();
    }
}*/



