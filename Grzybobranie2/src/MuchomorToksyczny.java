public abstract class MuchomorToksyczny extends Grzyb{

    protected Toksyny toksyny;

    @Override
    public String getInfo(){
        return super.getInfo()+" toksyny: "+toksyny;
    }


}
