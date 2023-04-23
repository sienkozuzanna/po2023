package ochroniarze;

import uczestnicy.CzlowiekZZewnatrz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RejestrObcych {

    private static Map<String, Set<CzlowiekZZewnatrz>> rejestrObcych = new HashMap<>();

    public RejestrObcych(){
        rejestrObcych = new HashMap<>();
    }

    public boolean czyMoznaDodac(CzlowiekZZewnatrz uczestnik){
        Set<CzlowiekZZewnatrz> czlowiekPoImieniu = rejestrObcych.get(uczestnik.getImie());
        return !czlowiekPoImieniu.contains(uczestnik);
    }

    public void dodajCzlowiekaZZewnatrz(CzlowiekZZewnatrz uczestnik){
        String imie = uczestnik.getImie();
        if(rejestrObcych.containsKey(imie)){
            Set<CzlowiekZZewnatrz> currentSet=rejestrObcych.get(imie);
            currentSet.add(uczestnik);
            rejestrObcych.put(imie,currentSet);
        } else {
            Set<CzlowiekZZewnatrz> currentSet = new HashSet<>();
            currentSet.add(uczestnik);
            rejestrObcych.put(uczestnik.getImie(),currentSet);
        }
    }

    public static Map<String, Set<CzlowiekZZewnatrz>> getRejestrObcych() {
        return rejestrObcych;
    }

    public Map<String, Set<CzlowiekZZewnatrz>> getRejestrObych() {
        return rejestrObcych;
    }
}
