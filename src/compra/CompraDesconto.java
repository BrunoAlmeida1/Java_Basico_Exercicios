package compra;

import java.util.Scanner;

public class CompraDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CAIXA =====");
        System.out.println("Informe o valor da compra:");
        double compra = sc.nextDouble();

        System.out.println("Digite a forma de pagamento\n1 - a vista\n2 - cartao\n3 - PIX");
        int opcao = sc.nextInt();

        double total = valorDesconto(compra, opcao);
        if(total > 0){
            System.out.printf("Total da compra com desconto: %.2f",total);
        }
    }

    public static double valorDesconto(double compra, int opcao) {
        switch (opcao){
            case 1: {
                compra *= 0.90;
                break;
            }
            case 2: {
                compra *= 0.95;
                break;
            }
            case 3: {
                compra *= 0.85;
                break;
            }
            default:
                System.err.println("ERRO! Opcao Invalida!\nDigite 1, 2 ou 3");
                compra = 0;
        }
        return compra;
    }

}
