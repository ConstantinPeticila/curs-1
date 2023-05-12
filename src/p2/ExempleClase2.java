package p2;

import p1.Persoana;

public class ExempleClase2 {

    public static void main(String[] args) {
        Persoana persoanaNoua =  new Persoana();
        Persoana costi = new Persoana("Costi", 25, 183);
        Persoana copiePersoana = persoanaNoua;
        String text = persoanaNoua.print();
        System.out.println(text);
        System.out.println(costi.print());

//        String nume = persoanaNoua.nume;
    }
}
