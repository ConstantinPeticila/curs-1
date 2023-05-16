package mostenire;

public class Animal {

    public Animal(String nume, int varsta) {
        System.out.println("Constructor Animal");
        this.nume = nume;
        this.varsta = varsta;
    }

    public String nume;
    public int varsta;

    void print(){
        System.out.println("Animal cu numele " + this.nume + " si varsta: " + this.varsta);
    }
}
