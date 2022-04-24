package salariocomissao;

import java.util.Scanner;

public class SalarioComissao {
    public static void main(String[] args) {
        
        double listaSalarios[] = new double[6];
        double salario = 200;

        System.out.println("===== SALARIOS DO MES ======\n");
        
        listaSalarios = registrarSalario(salario, listaSalarios);
        listarSalarios(listaSalarios);

    }

    private static void listarSalarios(double[] listaSalarios) {
        int duzentos = 0, trezen = 0, quatroc = 0, quient = 0, seisc =0, setesc =0, oitoc = 0, novec = 0, mil = 0;
        for(int i = 0; i < listaSalarios.length; i++){

            if(listaSalarios[i] >= 200 && listaSalarios[i] <= 299){
                duzentos++;
            }
            else if(listaSalarios[i] >= 300 && listaSalarios[i] <= 399){
                trezen++;
            }
            else if(listaSalarios[i] >= 400 && listaSalarios[i] <= 499){
                quatroc++;
            }
            else if(listaSalarios[i] >= 500 && listaSalarios[i] <= 599){
                quient++;
            }
            else if(listaSalarios[i] >= 600 && listaSalarios[i] <= 699){
                seisc++;
            }
            else if(listaSalarios[i] >= 700 && listaSalarios[i] <= 799){
                setesc++;
            }
            else if(listaSalarios[i] >= 800 && listaSalarios[i] <= 899){
                oitoc++;
            }
            else if(listaSalarios[i] >= 900 && listaSalarios[i] <= 999){
                novec++;
            }
            else if(listaSalarios[i] >= 1000){
                mil++;
            }
        }
        System.out.println("\nSalarios e o respectivo numero de funcionarios que os receberam\n");
        System.out.println("200,00 a 299,00: "+ duzentos+"\n300,00 a 399,00: "+trezen+"\n400,00 a 499,00: "+quatroc+"\n" +
                "500,00 a 599,00: "+quient+"\n600,00 a 699,00: "+seisc+"\n700,00 a 799,00: "+setesc+"\n800,00 a 899,00: "+
                oitoc+"\n900,00 a 999,00: "+novec+"\nMil ou mais: "+mil+"\n");
    }

    private static double[] registrarSalario(double salario, double[] lista) {
        Scanner sc = new Scanner(System.in);
        double vendas = 0;
        char opcao;
        int i = 0;
        do {
            System.out.println("Deseja registrar um salario?\n 'S' para sim / 'N' para nao ");
            opcao = sc.next().charAt(0);

            if(opcao == 's' || opcao == 'S') {
                System.out.println("Informe o valor das vendas: ");
                vendas = sc.nextDouble();

                salario += (vendas * 0.09);
                lista[i] = salario;
            }
            salario = 200;
            i++;
        }
        while ((opcao == 's' && i < 20 ) || (opcao == 'S' && i < 20));
        return lista;
    }
}
