package osoby;

import pomieszczenia.Kajuta;
import pomieszczenia.Pietro;
import pomieszczenia.Poklad;

import java.util.List;

public class Pasazer {

    private int pietro;

    public Pasazer(){
    }

    public void szukajMiejsca(Pietro pietro,Poklad poklad){
        List<Kajuta> listaKajut = pietro.getListaKajut();
        boolean czyDodany = false;
        for(Kajuta kajuta : listaKajut){
            if(kajuta.czyJestWolneMiejsce()){
                kajuta.addPasazer(this);
                czyDodany=true;
            }
        }
        if(!czyDodany){
            poklad.addPasazer(this);
        }
    }

}
