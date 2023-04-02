import java.util.Random;

public class KonsumentGrzybow {

    private static Random random= new Random();
    private DostawcaGrzybow dostawcaGrzybow;

    public KonsumentGrzybow(DostawcaGrzybow dostawcaGrzybow){
        this.dostawcaGrzybow=dostawcaGrzybow;
    }

    public void konsumujGrzyby(){
        int ileRazy=50+ random.nextInt(50);
        for(int i=0;i<ileRazy;i++){
            Grzyb grzyb = dostawcaGrzybow.zbierzGrzyba();
            if(grzyb!=null){
                grzyb.ugotuj();
                if(zjedz(grzyb)){
                    break;
                }
            }
        }
    }

    public boolean zjedz(Grzyb grzyb){
        if(grzyb.isTrujacy()){
            System.out.println("Uuups");
        }
        return grzyb.isTrujacy();
    }

}
