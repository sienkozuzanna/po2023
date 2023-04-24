package pomieszczenia;

import osoby.Pasazer;

import java.util.*;

public class Kajuta {

    private List<Pasazer> przedzial;
    private int pojemnosc;
    private int liczbaOsob;

    private static int ileOsobJest=0;

    public Kajuta(int pojemnosc,int liczbaOsob){
        this.przedzial = new LinkedList<Pasazer>();
        this.pojemnosc=pojemnosc;
        this.liczbaOsob=liczbaOsob;
    }

    public Pasazer getPasazer(int index) {
        return przedzial.get(index);
    }

    public List<Pasazer> getPrzedzial() {
        return przedzial;
    }

    public void addPasazer(Pasazer pasazer){
        przedzial.add(pasazer);
    }

    public boolean czyJestWolneMiejsce(){
        return ileOsobJest>=liczbaOsob;
    }

}
