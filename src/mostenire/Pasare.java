package mostenire;

public class Pasare extends Animal{

    boolean zboara;
    public Pasare(String nume, int varsta, boolean zboara) {
        super(nume, varsta);
        System.out.println("Constructor Pasare");
        this.zboara = zboara;
    }

    public Pasare(String nume, int varsta) {
        this(nume, varsta, false);
//        super(nume, varsta);
        this.zboara = false;

    }

}
