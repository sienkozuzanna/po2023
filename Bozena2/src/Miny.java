public abstract class Miny extends ElementyPodloza{

    private int identyfikatorMiny;
    private static int ileMin;
    protected boolean uzbrojona;


    public Miny(){
        ileMin++;
        this.identyfikatorMiny=ileMin*10;
        this.ekologiczna=false;
    }

    public void armMe(){
        uzbrojona=true;
    }
    @Override
    public abstract void pressMe();

}
