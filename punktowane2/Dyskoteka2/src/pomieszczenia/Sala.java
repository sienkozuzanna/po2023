package pomieszczenia;

import uczestnicy.Uczestnik;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sala {

    private Set<Uczestnik> kolekcjaUczestnikow = new LinkedHashSet<>();
    private static int maxPojemnosc;

    public Sala(int maxPojemnosc) {
        maxPojemnosc = maxPojemnosc;
    }

    public  void dodajUczestnika(Uczestnik uczestnik) throws PrzekroczonaMaxPojemnoscException {
        try {
            czyMogeDodac(uczestnik);
        } catch (PrzekroczonaMaxPojemnoscException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void czyMogeDodac(Uczestnik uczestnik) throws PrzekroczonaMaxPojemnoscException{
        if(kolekcjaUczestnikow.size()<maxPojemnosc){
            kolekcjaUczestnikow.add(uczestnik);
        } else {
            throw new PrzekroczonaMaxPojemnoscException();
        }

    }



}
