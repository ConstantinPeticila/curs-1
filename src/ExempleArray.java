public class ExempleArray {

    public static void main(String[] args) {
//        int[] numere = new int[3];
        int[] numere = {0,3,6,5,7};
        //itera
        for(int i = 0; i < numere.length; i++){
            if(i %2 == 0){
                numere[i] = 2;
            }
            String textDeAfisat = "Pe pozitia ";
            String textSecundDeAfisat = " este valoarea: ";
            System.out.println(textDeAfisat + i + textSecundDeAfisat +numere[i] );
        }
        System.out.println("--------------------------------");
        for(int element: numere){
            element = 3;
            System.out.println("valoarea: "+element);
        }

        System.out.println("--------------------------------");
        for(int element: numere){
            System.out.println("valoarea: "+element);
        }
    }
}
