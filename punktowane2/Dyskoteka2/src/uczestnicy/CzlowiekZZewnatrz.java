package uczestnicy;

public class CzlowiekZZewnatrz extends Uczestnik{

    public CzlowiekZZewnatrz(){
        super();
        setWiek(16,40);
        if(random.nextBoolean()){
            setImieDamskie();
        } else {
            setImieMeskie();
        }
    }

    @Override
    public String toString(){
        return imie+" "+String.valueOf(unikalneId);
    }

}
