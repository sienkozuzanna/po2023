package ochroniarze;

import pomieszczenia.Hol;
import pomieszczenia.PrzekroczonaMaxPojemnoscException;
import pomieszczenia.Sala;
import uczestnicy.Uczestnik;

import java.util.Random;

public class OchroniarzMaly {


    protected static Random random=new Random();
    protected Sala malaSala;
    protected Sala duzaSala;
    protected Hol hol;

    public OchroniarzMaly(){
        malaSala = new Sala(51);
        duzaSala = new Sala(75);
        hol = new Hol();
    }

    public boolean check(Uczestnik uczestnik) throws PrzekroczonaMaxPojemnoscException {
        try{
            int wiek = uczestnik.getWiek();
            if(wiek>=18){
                if(random.nextBoolean()){
                    duzaSala.dodajUczestnika(uczestnik);
                } else {
                    malaSala.dodajUczestnika(uczestnik);
                }
                return true;
            }
        } catch (PrzekroczonaMaxPojemnoscException e){
            throw new PrzekroczonaMaxPojemnoscException();
        }
        return false;
    }

}
