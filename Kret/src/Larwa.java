import java.util.Random;

public class Larwa extends ObiektyZiemne{

    private double masa;

    public Larwa(int wartoscOdzywcza) {
        super(wartoscOdzywcza);
        Random random = new Random();
        this.masa = random.nextDouble(2.0,3.0);
    }

    @Override
    public String toString(){
        return " @ ";
    }
}
