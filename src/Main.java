import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //PUNTO 1 A:
/*
        String texto = "Estamos en una clase de programacion en java";

        int contador = 0;

        for (int i=0; i<texto.length(); i++)
        if (texto.charAt(i)=='a'){
            contador++;
        }


            System.out.println("La letra se repite:" + contador + "veces");    }
        }

*/


        //  Punto 1 B:
/*
//de Menor a Mayor
        int numeros [] = {45,91,23};
        Arrays.sort(numeros);
        for (int i=0; i<numeros.length; i++){
            System.out.println(""+numeros[i]);
        }
        }
        }
        */

        /*

        //De mayor a menor
        int numeros [] = {45,91,23};
        Arrays.sort(numeros);
        for (int i=numeros.length-1;i>=0; i--){
            System.out.println(""+numeros[i]);
           }
           }
           }

            */

        // EJERCICIO 1 C:
/*

        int numeros[] = {10, 25, 50, 71, 32, 15, 5, 23, 7, 9, 60, 81, 77, 66, 55};
       int resultado = 0;
        int x = 50;
        for (int ingreso : numeros) {
            if (ingreso > x)
            {
                resultado +=ingreso;
            }

        }
        System.out.println("El total de numeros mayor a  " +x+ " sumados es:"+resultado);




    }

}

*/

       // EJERCICIO 2 .

           String textoOriginal = "estamos en una clase de programacion en java";
            String abecedario = "abcdefghijklmnopqrstuvwxyz ";
            String resultado = "";
            int desplazamiento = 2;


            for (int i = 0; i < textoOriginal.length(); i++) {
                char caracter = textoOriginal.charAt(i);

                if (caracter == ' ') {
                    resultado += ' ';
                }

                else {
                    int posicionActual = abecedario.indexOf(caracter);
                    int posicionDesplazada = (posicionActual + desplazamiento) % abecedario.length();
                    resultado += abecedario.charAt(posicionDesplazada);
                    }



            }
        System.out.println(resultado);


        }
    }















