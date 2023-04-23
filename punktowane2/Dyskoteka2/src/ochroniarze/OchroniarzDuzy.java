package ochroniarze;

import pomieszczenia.PrzekroczonaMaxPojemnoscException;
import uczestnicy.CzlowiekZZewnatrz;
import uczestnicy.Uczestnik;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OchroniarzDuzy extends OchroniarzMaly{

    private RejestrObcych rejestrObcych;

    public OchroniarzDuzy(){
        super();
        rejestrObcych=new RejestrObcych();
    }

    @Override
    public boolean check(Uczestnik uczestnik) throws PrzekroczonaMaxPojemnoscException {

        try{
            int wiek = uczestnik.getWiek();
            if(wiek>=18){
                if(random.nextBoolean()){
                    duzaSala.dodajUczestnika(uczestnik);
                } else {
                    malaSala.dodajUczestnika(uczestnik);
                }
                if(uczestnik instanceof CzlowiekZZewnatrz){
                    rejestrObcych.dodajCzlowiekaZZewnatrz((CzlowiekZZewnatrz) uczestnik);
                }
                return true;
            }
        } catch (PrzekroczonaMaxPojemnoscException e){
            throw new PrzekroczonaMaxPojemnoscException();
        }
        return false;
    }


    public void printStrangers(){
        Map<String, Set<CzlowiekZZewnatrz>> rejestr = rejestrObcych.getRejestrObych();
        Iterator<Map.Entry<String,Set<CzlowiekZZewnatrz>>> iterator = rejestr.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Set<CzlowiekZZewnatrz>> entry = iterator.next();
            iterator.remove();
            String imie = entry.getKey();
            Set<CzlowiekZZewnatrz> kolekcjaLudzi=entry.getValue();

            System.out.print(imie+": ");

            Iterator<CzlowiekZZewnatrz> iteratorSet = kolekcjaLudzi.iterator();
            while (iteratorSet.hasNext()){
                CzlowiekZZewnatrz czlowiekZZewnatrz = iteratorSet.next();
                iteratorSet.remove();
                System.out.println(czlowiekZZewnatrz);
            }

        }
    }


}
