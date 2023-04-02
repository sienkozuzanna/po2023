public class MuchomorCesarski extends Grzyb{


    public MuchomorCesarski() {
        this.twardosc=Twardosc.TWARDY;
        this.masaOwocnika=setMasaOwocnika(50,75);
    }

    @Override
    public String toString(){
        return "Muchomor Cesarski ["+getInfo()+"]";
    }
}
