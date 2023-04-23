package dyskoteka;

import pomieszczenia.Hol;
import pomieszczenia.PrzekroczonaMaxPojemnoscException;
import pomieszczenia.Sala;
import ochroniarze.OchroniarzDuzy;
import ochroniarze.OchroniarzMaly;
import uczestnicy.Uczestnik;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Dyskoteka {

    private static Random random = new Random();

    private Sala malaSala;
    private Sala duzaSala;
    private Hol holDyskoteka;
    private OchroniarzMaly ochroniarzMaly;

    private OchroniarzDuzy ochroniarzDuzy;

    public Dyskoteka(){
        malaSala = new Sala(51);
        duzaSala = new Sala(75);
        holDyskoteka = new Hol();
        ochroniarzMaly=new OchroniarzMaly();
        ochroniarzDuzy=new OchroniarzDuzy();
    }

    public void inviteAll() throws PrzekroczonaMaxPojemnoscException {
        List<Uczestnik> hol = holDyskoteka.getHol();

        Iterator<Uczestnik> iterator = hol.iterator();

        while(iterator.hasNext()){
            Uczestnik uczestnik = iterator.next();
            iterator.remove();
            boolean czyWszedl;
            if(random.nextBoolean()){
                czyWszedl=ochroniarzDuzy.check(uczestnik);
            } else {
                czyWszedl=ochroniarzMaly.check(uczestnik);
            }

            if(czyWszedl){
                holDyskoteka.removeFromHol(uczestnik);
            }
        }

    }

    public void goLive() throws PrzekroczonaMaxPojemnoscException {
        inviteAll();
        ochroniarzDuzy.printStrangers();
    }


}
