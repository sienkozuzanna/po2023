public class MuchomorSromotnikowy extends MuchomorToksyczny{

    public MuchomorSromotnikowy(){
        super();
        this.masaOwocnika=setMasaOwocnika(25,75);
        if(masaOwocnika<50){
            this.toksyny=Toksyny.ZABOJCZE;
        } else {
            this.toksyny=Toksyny.WYJATKOWOZOBOJCZE;
        }
    }

    @Override
    public String toString(){
        return "Muchomor Sromotniowy ["+getInfo()+"]";
    }

}
