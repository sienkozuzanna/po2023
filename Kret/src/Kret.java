import java.util.Random;

public class Kret implements MoleMotion{

    private Gatunek gatunek;
    private int wartoscOdzywcza;
    private ObiektyZiemne[][] obiektyZiemne;

    public Kret(Gatunek gatunek, int wartoscOdzywcza,ObiektyZiemne[][] obiektyZiemne) {
        this.gatunek = gatunek;
//        Random random = new Random();
//        this.wartoscOdzywcza = random.nextInt(200,240);
        this.wartoscOdzywcza=wartoscOdzywcza;
        this.obiektyZiemne=obiektyZiemne;
    }

    @Override
    public void goMole() {

        Random random = new Random();
        int wiersz = random.nextInt(0,obiektyZiemne.length);
        int kolumna = random.nextInt(0,obiektyZiemne[0].length);
        if(obiektyZiemne[wiersz][kolumna]!=null){
            this.wartoscOdzywcza+=obiektyZiemne[wiersz][kolumna].wartoscOdzywcza;
            System.out.println("Mniam!  Wartosc odzywcza: "+obiektyZiemne[wiersz][kolumna].wartoscOdzywcza+
                    " indeksy: wiersz " +wiersz+" kolumna "+kolumna);
            obiektyZiemne[wiersz][kolumna]=null;
        } else {
            System.out.println("Pusto :(");
        }

    }

    @Override
    public String getNutritionalValue() {
        return String.valueOf(wartoscOdzywcza);
    }


}
