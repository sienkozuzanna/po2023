import java.util.Random;

public class Dzdzownica extends ObiektyZiemne{

    private double masa;

    public Dzdzownica(int wartoscOdzywcza) { //czy tutaj nie moge usunac argumentu w konstruktorze i zrobic super
        super(wartoscOdzywcza);
        Random random = new Random();
        this.masa = random.nextDouble(0.5,1.0);
    }

    @Override
    public String toString(){
        return " {} ";
    }
}
