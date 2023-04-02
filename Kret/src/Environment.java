import java.util.Random;

public class Environment {

    private ObiektyZiemne[][] tablica; //czy to jest legalne jak tam jest abstract?
    private final static int wartoscOdzywczaDzdzownicy=3;

    private MoleMotion moleMotion;

    //environment bez kreta
    public Environment(int m, int n, int iloscLarw, int iloscDzdzownic){

        ObiektyZiemne[][] tablica = new ObiektyZiemne[m][n];
        Random random = new Random();

        while (iloscLarw>0 | iloscDzdzownic>0){
            int wiersz=random.nextInt(0,m);
            int kolumna=random.nextInt(0,n);
            if (tablica[wiersz][kolumna]==null & iloscLarw>0){
                tablica[wiersz][kolumna]= new Larwa(random.nextInt(3,5));
                iloscLarw--;
            } else if (tablica[wiersz][kolumna]==null & iloscDzdzownic>0){
                tablica[wiersz][kolumna]=new Dzdzownica(wartoscOdzywczaDzdzownicy);
                iloscDzdzownic--;
            }
        }

        for(int i=0;i<tablica.length;i++){
            for(int j=0;j<tablica[0].length;j++){
                if(tablica[i][j]==null){
                    tablica[i][j]=new Gleba(0);
                }
            }
        }

        this.tablica=tablica;
    }

    //drugi konstruktor
    public Environment(Gatunek gatunek,int m, int n, int iloscLarw, int iloscDzdzownic){
        this(m,n,iloscLarw,iloscDzdzownic);
        Random random = new Random();
        int wartoscOdzywcza = random.nextInt(200,240);
        this.moleMotion=new Kret(gatunek,wartoscOdzywcza,tablica);
    }

    public void runMole(){
        for(int i=0;i<10;i++){
            this.moleMotion.goMole();
            System.out.println(this);
            System.out.println(this.moleMotion.getNutritionalValue());
        }
    }


    @Override
    public String toString() { //czy to jest ok nadpisane toString?

        String string = "";

        for(int i=0;i< tablica.length;i++){
            for(int j=0;j<tablica[0].length;j++){
                if(tablica[i][j]==null){
                    string+=" ";
                } else {
                    string+=tablica[i][j].toString();
                }
            }
            string+="\n";
        }
        return string;
    }

    public ObiektyZiemne[][] getTablica() {
        return tablica;
    }

    public void setenvironment(ObiektyZiemne[][] environment) {
        this.tablica = tablica;
    }

}
