package consoantes;

import java.util.Scanner;

public class ContaConsoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CONTADOR DE CONSOANTES =====\n");

        String letras[] = new String[6];
        String vogais = "a e i o u";

        for(int i = 0; i < letras.length; i++){
            System.out.printf("\nDigite a %da letra: ", i+1);
            letras[i] = sc.next();
        }
        int consoantes = contarConsoantes(letras, vogais);
        System.out.printf("O vetor possui %d consoantes", consoantes);

    }
    private static int contarConsoantes(String[] letras, String vogais) {

        int contador = 0;
        for(int i = 0; i < letras.length; i++){
            if(!vogais.contains(letras[i])){ //contains é usado para saber se uma string contem uma outra string
                contador++;
            }
        }
        return contador;
    }
}
