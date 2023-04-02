public class Trawa extends Naturalne{


    public Trawa(){
        super();
        setWysokosc(10.5,50.5);
    }

    @Override
    public String toString(){
        return " | ";
    }


    @Override
    public void pressMe() {
        System.out.println("Chruup");
    }
}
