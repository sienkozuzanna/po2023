import osoby.Kapitan;
import osoby.Oficer;
import osoby.Pasazer;
import pomieszczenia.Maszynownia;
import pomieszczenia.Pietro;
import pomieszczenia.Poklad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Statek {

    private List<Pasazer> listaPasazerow;
    private Kapitan kapitan;
    private Set<Oficer> listaOficerow;
    private Poklad podklad;
    private List<Pietro> listaPieter = new ArrayList<>();
    private final int liczbaPieter = 7;
    private Maszynownia maszynownia;

    public Statek() {
        this.listaPasazerow = new ArrayList<>();
        this.kapitan = new Kapitan(listaPieter,listaPasazerow,podklad);
        this.listaOficerow = new HashSet<>();
        this.podklad = new Poklad();
        this.listaPieter = new ArrayList<>();
        for(int i=0;i<7;i++){
            listaPieter.add(new Pietro());
        }
        this.maszynownia = maszynownia;
    }

    public List<Pasazer> getListaPasazerow() {
        return listaPasazerow;
    }

    public Kapitan getKapitan() {
        return kapitan;
    }

    public Set<Oficer> getListaOficerow() {
        return listaOficerow;
    }

    public Poklad getPodklad() {
        return podklad;
    }

    public List<Pietro> getListaPieter() {
        return listaPieter;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public Maszynownia getMaszynownia() {
        return maszynownia;
    }
}
