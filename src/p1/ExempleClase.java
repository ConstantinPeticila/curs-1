package p1;

public class ExempleClase {

    public static void main(String[] args) {
//        new p1.Persoana();

//        p1.Pisica.varsta;

        Persoana persoanaNoua =  new Persoana();
        Persoana costi = new Persoana("Costi", 25, 183);
        Persoana copiePersoana = persoanaNoua;
        String text = persoanaNoua.print();
        System.out.println(text);
        System.out.println(costi.print());

        String nume = persoanaNoua.nume;
        //referinta
        persoanaNoua.inaltime = 160;
//        copiePersoana.varsta = 25;
        System.out.println(persoanaNoua.print());
        System.out.println(copiePersoana.print());
        System.out.println(costi.esteMajor());

        Pisica tom = new Pisica();
        System.out.println(tom.getVarsta());
        tom.setVarsta(10);
        System.out.println(tom.getVarsta());

        //static
        System.out.println("-------------");
//        p1.ClasaUtilitara clasaUtilitara = new p1.ClasaUtilitara();
        System.out.println(ClasaUtilitara.suma(1,2));

    }
}
