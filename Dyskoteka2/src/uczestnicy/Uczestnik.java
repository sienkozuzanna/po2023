package uczestnicy;

import java.util.List;
import java.util.Random;

public abstract class Uczestnik {

    protected static final String[] imionaDamskie=new String[]{"Zofia","Zuzanna","Hanna","Maja",
    "Laura","Julia","Oliwia","Alicja","Wiktoria","Aleksandra"};

    protected static final String[] imionaMeskie=new String[]{"Antoni","Jan","Olek","Nikodem",
    "Franek","Jakub","Leon","Mikolaj","Wiktor","Lukasz"};

    protected static Random random=new Random();

    protected int unikalneId;
    protected static int licznikId;
    protected String imie;
    protected String nazwisko;
    protected int wiek;

    public Uczestnik(){
        this.unikalneId=licznikId;
        licznikId++;
    }

    public void setWiek(int x,int y) {
        this.wiek = x+random.nextInt(y-x+1);
    }

    public void setImieDamskie(){
        int ktoreImie = random.nextInt(imionaDamskie.length);
        this.imie=imionaDamskie[ktoreImie];
    }

    public void setImieMeskie(){
        int ktoreImie = random.nextInt(imionaMeskie.length);
        this.imie=imionaMeskie[ktoreImie];
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uczestnik uczestnik = (Uczestnik) o;

        return unikalneId == uczestnik.unikalneId;
    }

    @Override
    public int hashCode() {
        return unikalneId;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }
}
