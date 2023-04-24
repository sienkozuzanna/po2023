import nadbrzeze.Nadbrzeze;
import osoby.Kapitan;
import osoby.Pasazer;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Statek statek = new Statek();
        Nadbrzeze nadbrzeze = new Nadbrzeze();
        Kapitan kapitan = new Kapitan(statek.getListaPieter(),statek.getListaPasazerow(),statek.getPodklad());
        System.out.println(kapitan.getListaPieter());
        kapitan.zaladujPasazerow(nadbrzeze);
    }
}