package uczestnicy;

public class Studenci extends Uczestnik{

    protected String nazwisko;

    protected static final String[] nazwiska=new String[]{"Nowak","Kowalski/a","Wisniewski/a","Wojcik",
            "Kowalczyk","Kaminski/a","Lewandowski/a","Zielinski/a","Szymanski/a"};

    public Studenci(){
        super();
        setWiek(18,26);
        setNazwisko();
    }

    public void setNazwisko(){
        int ktoreImie = random.nextInt(nazwiska.length);
        this.nazwisko=nazwiska[ktoreImie];
    }

}
