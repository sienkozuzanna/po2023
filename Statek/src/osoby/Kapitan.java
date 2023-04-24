package osoby;

import nadbrzeze.Nadbrzeze;
import pomieszczenia.Pietro;
import pomieszczenia.Poklad;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class Kapitan {

    private static Random random = new Random();
    private Poklad poklad;
    private List<Pietro> listaPieter;
    private List<Pasazer> listaPasazerow;


    public Kapitan(List<Pietro> listaPieter,List<Pasazer> listaPasazerow,Poklad poklad){
        this.listaPieter=listaPieter;
        this.listaPasazerow=listaPasazerow;
        this.poklad = poklad;
    }

    public void zaladujPasazerow(Nadbrzeze nadbrzeze){
        Set<Pasazer> pasazerowie = nadbrzeze.getPasazerowieNadbrzeze();
        for(Pasazer pasazer : pasazerowie){
            int ktorePietro = random.nextInt(7);
            pasazer.szukajMiejsca(listaPieter.get(ktorePietro),poklad);
            int czyWpisany = random.nextInt(10);
            if(czyWpisany!=0){
                listaPasazerow.add(pasazer);
            }
        }
    }

    public List<Pietro> getListaPieter() {
        return listaPieter;
    }
}
