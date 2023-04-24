package nadbrzeze;

import osoby.Pasazer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Nadbrzeze {

    private Set<Pasazer> pasazerowieNadbrzeze;

    public Nadbrzeze(){
        Set<Pasazer> pasazerowie = new LinkedHashSet<>();
        for(int i=0;i<500;i++){
            pasazerowie.add(new Pasazer());
        }
        pasazerowieNadbrzeze=pasazerowie;
    }

    public Set<Pasazer> getPasazerowieNadbrzeze() {
        return pasazerowieNadbrzeze;
    }
}
