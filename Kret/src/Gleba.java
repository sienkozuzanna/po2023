import java.util.Random;

public class Gleba extends ObiektyZiemne{

    private double gestosc;

    public Gleba(int wartoscOdzywcza) {
        super(wartoscOdzywcza);
        Random random = new Random();
        this.gestosc= random.nextDouble(1.4,2.4);
    }

    @Override
    public String toString(){
        return " # ";
    }
}
