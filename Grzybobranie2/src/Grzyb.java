import java.util.Random;

public abstract class Grzyb {

    protected Twardosc twardosc;
    protected int masaOwocnika;

    private static Random random=new Random();

    public Grzyb(){
        setTwardosc();
    }

    public int setMasaOwocnika(int x,int y) {
        return masaOwocnika=random.nextInt(x,y);
    }

    public void setTwardosc(){
        Twardosc opcjeTwardosci[]=Twardosc.values();
        twardosc=opcjeTwardosci[random.nextInt(opcjeTwardosci.length)];
    }

    public String getInfo(){
        return "twardosc: "+twardosc+" masa owocnika: "+masaOwocnika;
    }

    public void ugotuj(){
        twardosc=Twardosc.MIEKKI;
    }

    public boolean isTrujacy(){
        return false;
    }


}
