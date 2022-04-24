package abonosalarial;

import java.util.ArrayList;
import java.util.Scanner;

public class AbonoSalarial {
    public static void main(String[] args) {
        ArrayList<Double> salario = new ArrayList<Double>();
        ArrayList<Double> abono = new ArrayList<Double>();

        System.out.println("\n==== ABONO SALARIAL ====");
        System.out.println("========================\n");

        System.out.println("Cálculo do Abono");
        System.out.println("----------------\n");

        calculaAbono(salario, abono);
    }

    private static void calculaAbono(ArrayList<Double> salario, ArrayList<Double> abono) {
        Scanner sc = new Scanner(System.in);
        double salarioBase;

        do {
            System.out.println("Informe o salário base: ");
            salarioBase = sc.nextDouble();

            if(salarioBase != 0){
                salario.add(salarioBase);

                if(salarioBase > 500){
                    salarioBase *= 0.2;
                    abono.add(salarioBase);
                }else {
                    abono.add(100.0);
                }
            }
        }while (salarioBase != 0);

        resultadoAbono(salario, abono);
    }

    private static void resultadoAbono(ArrayList<Double> salario, ArrayList<Double> abono) {
        double totalAbono = 0, maiorValor = 0;
        int valorMinimo = 0;

        System.out.println("\nPROJEÇÃO DE GASTOS COM O ABONO SALARIAL");
        System.out.println("=====================================\n");

        for (int i = 0; i < salario.size(); i++){
            System.out.printf("Salário: %.2f\n", salario.get(i));

            totalAbono += abono.get(i);

            if(abono.get(i) == 100.0){
                valorMinimo++;
            }
            if (maiorValor < abono.get(i)){
                maiorValor = abono.get(i);
            }
        }
        System.out.println("\nSalário  | Abono");
        System.out.println("-----------------");

        for (int i = 0; i < salario.size(); i++){
            System.out.printf("%.2f  -  %.2f\n", salario.get(i), abono.get(i));
        }
        System.out.printf("\nForam processados %d colaboradores\n", salario.size());
        System.out.printf("Total de gastos com abonos: %.2f\n", totalAbono);
        System.out.printf("Valor mínimo pago a %d colaboradores\n", valorMinimo);
        System.out.printf("Maior valor de abono pago: %.2f\n", maiorValor);
    }
}
