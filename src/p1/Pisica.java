package p1;

public class Pisica {

    private int varsta;
    int greutate;

    String rasa;
    String nume;

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta(){
        return this.varsta;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getRasa() {
        return rasa;
    }

    public String getNume() {
        return nume;
    }

    public void scoateSunet(String sunet){
        System.out.println(sunet);
    }

}
