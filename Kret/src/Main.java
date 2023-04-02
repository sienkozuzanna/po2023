public class Main {
    public static void main(String[] args) {
        Environment environment=new Environment(Gatunek.EUROPEA,10,7,17,8);
        System.out.println(environment);

        environment.runMole();
    }
}