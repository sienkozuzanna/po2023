import java.util.Random;

public class Pole implements dostawcaPola{

    private static Random random= new Random();
    private ElementyPodloza[][] pole;

    public Pole(){
        pole=new ElementyPodloza[100][100];
        InicjalizujElementamiPodlozna();

    }

    private void InicjalizujElementamiPodlozna(){
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                int czyElementPodloza=random.nextInt(10);
                int czyMinaUzbrojona= random.nextInt(10);
                if(czyElementPodloza<4){
                    switch (random.nextInt(4)){
                        case 0:
                            pole[i][j]=new Purchawka();
                            break;
                        case 1:
                            pole[i][j]=new Trawa();
                            break;
                        case 2:
                            pole[i][j]=new MinaPrzeciwczolgowa();
                            if(czyMinaUzbrojona<9){
                                ((Miny) pole[i][j]).armMe();
                            }
                            break;
                        default:
                            pole[i][j]=new MinaPrzeciwpiechotna();
                            if(czyMinaUzbrojona<9){
                                ((Miny) pole[i][j]).armMe();
                            }
                    }
                }
            }
        }
    }

    public ElementyPodloza[][] getPole() {
        return pole;
    }

    @Override
    public void destroyMines(Pole pole) {

    }
}
