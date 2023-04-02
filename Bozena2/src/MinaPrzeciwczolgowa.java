public class MinaPrzeciwczolgowa extends Miny{

    private double masaMaterialuWybuchoweg;

    public MinaPrzeciwczolgowa(){
        super();
        this.masaMaterialuWybuchoweg= random.nextDouble(1.5,2.5);
    }

    @Override
    public String toString(){
        return " X ";
    }

    @Override
    public void pressMe() {
        if(uzbrojona){
            System.out.println("Kabooom!!!!");
        } else{
            System.out.println("Chrup");
        }
    }


}
