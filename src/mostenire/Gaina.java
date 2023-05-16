package mostenire;

public class Gaina extends Pasare{

    public Gaina(String nume, int varsta, boolean zboara) {
        super(nume, varsta, zboara);
    }


    @Override
     public void print(){
        System.out.println("Gaina cu numele " + this.nume + " si varsta: " + this.varsta);
    }

    public boolean esteClosca(){
        return true;
    }

    @Override
    public String toString() {
        return "Gaina{" +
                "zboara=" + zboara +
                '}';
    }
}
