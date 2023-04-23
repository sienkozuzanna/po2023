import dyskoteka.Dyskoteka;
import pomieszczenia.PrzekroczonaMaxPojemnoscException;

public class Main {
    public static void main(String[] args) throws PrzekroczonaMaxPojemnoscException {
        Dyskoteka dyskoteka = new Dyskoteka();
        dyskoteka.goLive();
    }
}