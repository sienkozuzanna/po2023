import java.util.Random;

public class Bozena implements dostawcaPola {

    private static Random random=new Random();
    private dostawcaPola dostawcaPola;

    public Bozena(dostawcaPola dostawcaPola) {
        this.dostawcaPola = dostawcaPola;
    }

    @Override
    public void destroyMines(Pole pole){
        int wiersz = random.nextInt(pole.getPole().length);
        for(int j=0;j<pole.getPole()[0].length;j++){
            if(pole.getPole()[wiersz][j]!=null){
                pole.getPole()[wiersz][j].pressMe();
                pole.getPole()[wiersz][j]=null;
            }
        }
    }

}
