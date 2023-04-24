package pomieszczenia;

import uczestnicy.CzlowiekZZewnatrz;
import uczestnicy.Student;
import uczestnicy.Studentka;
import uczestnicy.Uczestnik;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hol {

    private List<Uczestnik> hol = new LinkedList<>();

    public Hol(){
        for(int i=0;i<33;i++){
            hol.add(new Studentka());
        }
        for(int i=0;i<33;i++){
            hol.add(new Student());
        }
        for(int i=0;i<33;i++){
            hol.add(new CzlowiekZZewnatrz());
        }
        Collections.shuffle(hol);
    }

    public List<Uczestnik> getHol() {
        return hol;
    }

    public void removeFromHol(Uczestnik uczestnik){
        hol.remove(uczestnik);
    }
}
