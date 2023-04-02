public abstract class Naturalne extends ElementyPodloza {

    protected double wysokosc;

    public Naturalne(){
        this.ekologiczna=true;
    }

    protected void setWysokosc(double x, double y){
        wysokosc= x+random.nextDouble(y-x+1);
    }

    @Override
    public abstract void pressMe();

}
