package mostenire;

public class Main {
    public static void main(String[] args) {
    /*    Pasare p = new Pasare("nume", 1, true);
        System.out.println(p.varsta);
        System.out.println(p.zboara);
        p.print();
//        System.out.println(p.esteClosca());

//        Animal animal = new Animal("numeAnimal", 2);
//        System.out.println(animal.zboara);

        Gaina gaina = new Gaina("gigel", 1, false);
        gaina.print();
        System.out.println(gaina.esteClosca());*/

        Animal gaina = new Gaina("gaina", 1, false);
//        System.out.println(gaina.esteClosca());
        gaina.print();

        Object animal = new Animal("animal", 4);
        Gaina animal2 = (Gaina) gaina;
        System.out.println(animal2.esteClosca());


        System.out.println(gaina instanceof Animal);
        System.out.println(gaina instanceof Gaina);
        System.out.println(animal instanceof Gaina);

        System.out.println(gaina);
    }
}
