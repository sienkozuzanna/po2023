package pomieszczenia;

import osoby.Pasazer;

import java.util.ArrayList;
import java.util.List;

public class Pietro extends PomieszczeniaNaStatku{

    private List<Kajuta> listaKajut = new ArrayList<>();
    private int pojemnosc;
    private int iloscKajut;

    public Pietro(){
        pojemnosc= 2+random.nextInt(3);
        iloscKajut=10+ random.nextInt(11);
        makeListaKajut(pojemnosc,iloscKajut);
    }

    private void makeListaKajut(int pojemnosc, int iloscKajut){
        for(int i=0;i<iloscKajut;i++){
            listaKajut.add(new Kajuta(pojemnosc, random.nextInt(pojemnosc+1)));
        }
    }

    public List<Kajuta> getListaKajut() {
        return listaKajut;
    }

    public int ilePodroznychNaPietrze(){
        int ilePodroznych=0;
        for(Kajuta kajuta : listaKajut){
            for(Pasazer pasazer : kajuta.getPrzedzial()){
                if(pasazer!=null){
                    ilePodroznych++;
                }
            }
        }
        return ilePodroznych;
    }
}
