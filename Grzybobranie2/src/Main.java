public class Main {
    public static void main(String[] args) {
        DostawcaGrzybow dostawcaGrzybow=new Las(50,50);
        KonsumentGrzybow konsumentGrzybow =new KonsumentGrzybow(dostawcaGrzybow);
        konsumentGrzybow.konsumujGrzyby();
    }
}