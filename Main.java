package poo;

public class Main {

    public static void main(String[] args) {
        Integer[] intVector={101,99,12,19,21,111,345,25,77,81};
        Integer[] result= Utils.ordenar(intVector);
        System.out.println("el correcto ordenado es ");
        for(int  r:result)


            System.out.println(r);


        Float [] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f };
        Float [] result2 = Utils.ordenar (floatVector);
        System.out.println("el segundo correcto ordenado es");


        for(float  r:result2)


            System.out.println(r);

        //String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"}; //no es aceptado por el tipo que es
       // String [] result3 = Utils.ordenar (strVector);


           //Jordan Medina Tafolla
           // matricula S19022223







    }

}




