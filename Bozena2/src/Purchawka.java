public class Purchawka extends Naturalne{


    public Purchawka(){
        setWysokosc(3.5,7.5);
        this.ekologiczna= random.nextBoolean();

    }

    @Override
    public String toString(){
        return " o ";
    }

    @Override
    public void pressMe() {
        System.out.println("Puffff");
    }


}
