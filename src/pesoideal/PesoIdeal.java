package pesoideal;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SEU PESO IDEAL =====");
        System.out.println("Informe seu sexo: M - Masculino / F - Feminino");
        char sexo = sc.next().charAt(0);

        System.out.println("Informe sua altura:");
        double altura = sc.nextDouble();

        double ideal = calculaPeso(sexo, altura);
        System.out.println((ideal != 0)?"Seu peso ideal e: "+ ideal:"");
    }

    public static double calculaPeso(char sexo, double h) {
        double ideal = 0;
        if(sexo == 'm' || sexo == 'M'){
            ideal = (72.7 * h) - 58;
        }
        else if(sexo == 'f' || sexo == 'F'){
            ideal = (62.1 * h) - 44.7;
        }
        else System.err.println("ERRO! Sexo Invalido!\nDigite M ou F");

        return ideal;
    }

}
