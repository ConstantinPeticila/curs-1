package p1;

public class Persoana{

    public Persoana(){
        this("George", 30, 180);
        System.out.println("S-a apelat constructorul fara params");
//        nume = "George";
//        varsta = 30;
//        inaltime = 180;
    }

    public Persoana(String nume, int varsta, int inaltime){
        System.out.println("s-a apelat constructorul cu params");
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }

    String nume;
    private int varsta;
    public int inaltime;

    public void incrementeazaVarsta(){
        varsta++;
        return;
    }

    public String print(){
        String nume = "Ionut";
        int varsta = 2;
        return  " p1.Persoana are numele " + this.nume + ", varsta de " + this.varsta + " ani si inaltimea " + inaltime;
//        return text;
    }

    public boolean esteMajor(){
        return varsta >= 18;
    }
}
