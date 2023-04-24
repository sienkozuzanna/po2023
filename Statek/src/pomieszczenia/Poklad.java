package pomieszczenia;

import osoby.Pasazer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Poklad {

    private static Set<Pasazer> listaPasazerow;

    public Poklad(){
        listaPasazerow=new LinkedHashSet<Pasazer>();
    }

    public Set<Pasazer> getListaPasazerow() {
        return listaPasazerow;
    }

    public void addPasazer(Pasazer pasazer){
        listaPasazerow.add(pasazer);
    }
}
