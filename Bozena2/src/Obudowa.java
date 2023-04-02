import java.util.Random;

public enum Obudowa {

    METAL,PLASTKI,KARTON;

    public static Obudowa getRandomObudowa(){
        Random random = new Random();
        int forma = random.nextInt();
        return switch (forma) {
            case 0 -> Obudowa.KARTON;
            case 1 -> Obudowa.METAL;
            default -> Obudowa.PLASTKI;
        };
    }

}
