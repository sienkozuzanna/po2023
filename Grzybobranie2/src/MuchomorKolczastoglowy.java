public class MuchomorKolczastoglowy extends Grzyb{

    public MuchomorKolczastoglowy() {
        super();
        this.masaOwocnika=setMasaOwocnika(25,50);
    }

    @Override
    public String toString(){
        return "Muchomor Kolczastoglowy ["+getInfo()+"]";
    }
}
