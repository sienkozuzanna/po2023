public class Main {
    public static void main(String[] args) {


        dostawcaPola pole = new Pole();
        Bozena bozena = new Bozena(pole);
        for(int i=0;i<50;i++){
            bozena.destroyMines((Pole)pole);
        }

    }
}