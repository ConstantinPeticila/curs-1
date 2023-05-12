package mostenire;

public class Pasare extends Animal{

    boolean zboara;
    public Pasare(String nume, int varsta, boolean zboara) {
        super(nume, varsta);
        System.out.println("Constructor Pasare");
        this.zboara = zboara;
    }
}
