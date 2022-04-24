package votacaoservidor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VotacaoServidor {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> sistemaOperacional = new LinkedHashMap<String, Double>();

        sistemaOperacional.put("Windows", 0.0);
        sistemaOperacional.put("Unix", 0.0);
        sistemaOperacional.put("Linux", 0.0);
        sistemaOperacional.put("Netware", 0.0);
        sistemaOperacional.put("MacOS", 0.0);
        sistemaOperacional.put("Outros", 0.0);

        System.out.println("\n==== Melhor SO para servidores ====\n");

        votaSO(sistemaOperacional);
    }

    private static void votaSO(LinkedHashMap<String, Double> sistemaOperacional) {
        Scanner sc = new Scanner(System.in);
        double[] votos = new double[6];
        int voto, sair = 0, cont = 0;

        do {
            System.out.println("Para votar digite o número correspondente ao sistema operacional\n" +
                    "1 - Windows\n2 - Unix\n3 - Linux\n4 - Netware\n5 - Mac OS\n6 - Outros\n0 - Sair\n");
            voto = sc.nextInt();
            cont++;

            switch (voto){
                case 1:{
                    votos[0] += 1;
                    sistemaOperacional.put("Windows", votos[0]);
                    break;
                } case 2:{
                    votos[1] += 1;
                    sistemaOperacional.put("Unix", votos[1]);
                    break;
                } case 3:{
                    votos[2] += 1;
                    sistemaOperacional.put("Linux", votos[2]);
                    break;
                } case 4:{
                    votos[3] += 1;
                    sistemaOperacional.put("Netware", votos[3]);
                    break;
                } case 5:{
                    votos[4] += 1;
                    sistemaOperacional.put("MacOS", votos[4]);
                    break;
                } case 6:{
                    votos[5] += 1;
                    sistemaOperacional.put("Outros", votos[5]);
                    break;
                } case 0:{
                    sair = 1;
                    cont--;
                    break;
                } default:{
                    System.err.println("Opção Inválida!\n");
                    cont--;
                }
            }
        }while (sair == 0);

        calculaVotos(sistemaOperacional, cont);
    }

    private static void calculaVotos(LinkedHashMap<String, Double> sistemaOperacional, int cont) {
        double[] porcento = new double[6];
        String melhor = new String();
        int i = 0;
        double porcentagem = 0, votos = 0;

        System.out.println("\n==== RESULTADO DA VOTAÇÃO ====\n");
        System.out.println("Sistema Operacional\t  Votos\t \t%\n");
        System.out.println("-------------------\t  ------\t---\n");

        for(Map.Entry<String, Double> sistemas : sistemaOperacional.entrySet()){
            porcento[i] = (sistemas.getValue() * 100)/cont;
            System.out.printf(sistemas.getKey()+"\t \t \t \t \t"+sistemas.getValue()+"\t \t%.2f\n", porcento[i]);

            if(porcentagem < porcento[i]){
                porcentagem = porcento[i];
                melhor = sistemas.getKey();
                votos = sistemas.getValue();
            }
            i++;
        }
        System.out.println("-------------------\t  ------");
        System.out.printf("Total                   %d\n", cont);
        System.out.printf("\nO sistema operacional mais votado foi o %s, com %.0f votos, correspondendo a " +
                "%.2f%% dos votos\n", melhor, votos, porcentagem);

    }

}
