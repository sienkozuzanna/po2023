public class MuchomorSzarawy extends MuchomorToksyczny{

    private static final int rokOdkryciaGatunku = 1783;

    public MuchomorSzarawy(){
        super();
        this.toksyny=Toksyny.TRUJACE;
        this.masaOwocnika=setMasaOwocnika(25,75);
    }

    @Override
    public String toString(){
        return "Muchomor Szarawy ["+getInfo()+" rok odkrycia gatunku: "+rokOdkryciaGatunku+"]";
    }

    @Override
    public void ugotuj(){
        super.ugotuj();
        toksyny=Toksyny.NIEOBENCE;
    }

    @Override
    public boolean isTrujacy(){
        return toksyny!=Toksyny.NIEOBENCE;
    }

}
