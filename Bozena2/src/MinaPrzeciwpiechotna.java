public class MinaPrzeciwpiechotna extends Miny{

    private Obudowa obudowa;

    public MinaPrzeciwpiechotna(){
        super();
        this.obudowa=Obudowa.getRandomObudowa();
        if(obudowa.equals(Obudowa.KARTON)){
            this.ekologiczna=true;
        }

    }

    @Override
    public String toString(){
        return " x ";
    }

    @Override
    public void pressMe() {
        if(uzbrojona){
            System.out.println("Booom!");
        } else{
            System.out.println("Chrup");
        }
    }




//    private Obudowa getRandomObudowa(){
//        int forma = random.nextInt();
//        switch (forma){
//            case 0:
//                return Obudowa.KARTON;
//            case 1:
//                return Obudowa.METAL;
//            default:
//                return Obudowa.PLASTKI;
//        }
//    }
}
