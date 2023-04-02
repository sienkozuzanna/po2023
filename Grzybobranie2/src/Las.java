import java.util.Random;

public class Las implements DostawcaGrzybow{


    private static final int domyslnaDlugoscTablicy=100;
    private static Random random=new Random();
    private Grzyb[][] poleGrzybow;

    public Las(int x, int y){
        if(x<=0){
            x=domyslnaDlugoscTablicy;
        }
        if(y<=0){
            y=domyslnaDlugoscTablicy;
        }

        this.poleGrzybow=new Grzyb[x][y];
        inicjujPoleGrzybami();
    }

    private void inicjujPoleGrzybami(){
        int wylosowanaKolumna = random.nextInt(poleGrzybow[0].length);
        for(int i=0;i<poleGrzybow.length;i++){
            for(int j=0;j<poleGrzybow[0].length;j++){
                int prawd=random.nextInt(10);
                if(j==wylosowanaKolumna){
                    continue;
                }
                if(prawd<2){
                    switch(random.nextInt(4)){
                        case 0:
                            poleGrzybow[i][j]=new MuchomorCesarski();
                            break;
                        case 1:
                            poleGrzybow[i][j]=new MuchomorKolczastoglowy();
                            break;
                        case 2:
                            poleGrzybow[i][j]=new MuchomorSromotnikowy();
                            break;
                        default:
                            poleGrzybow[i][j]=new MuchomorSzarawy();
                    }
                }

            }
        }
    }

    public Grzyb zbierzGrzyba(){
        int wiersz = random.nextInt(poleGrzybow.length);
        int kolumna = random.nextInt(poleGrzybow[0].length);
        Grzyb zebranyGrzyb = poleGrzybow[wiersz][kolumna];
        poleGrzybow[wiersz][kolumna]=null;
        return zebranyGrzyb;
    }

}
