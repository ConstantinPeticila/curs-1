public class Exemple {

    public static void main(String[] args) {
        //se face asignare pentru nr la valoarea 10
       /* int nr = 10;
        if(nr%2 == 0){
            System.out.println(nr + " este par");
        } else {
            System.out.println(nr + " e impar");
        }
        int nr2 = (nr%2 == 0) ? 8:12;
        System.out.println(nr2);

        int nr3;
        if(nr%2 ==0){
            nr3 = 10;
        } else {
            nr3 = 12;
        }
        System.out.println(nr3);*/

        //switch
        int expresie = 3;
        switch (expresie) {
            case 3:{
                System.out.println("Numarul primit este 3");
                break;
            }
            case 4: {
                System.out.println("Numarul este 4");
                break;
            }
            default:{
                System.out.println("Numarul primit nu i egal cu niciun caz");
                break;
//                System.out.println("Numarul");
            }
        }
    }
}
