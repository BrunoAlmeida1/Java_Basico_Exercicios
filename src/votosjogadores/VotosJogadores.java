package votosjogadores;

import java.util.HashMap;
import java.util.Scanner;

public class VotosJogadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] jogadores = new double[23];
        int numero;
        double cont = 0;

        System.out.println("==== MELHOR JOGADOR DA PARTIDA ====\n");

        do {
            System.out.println("Escolha o melhor jogador\nDigite um número de 1 ao 23 ou 0 para sair: ");
            numero = sc.nextInt();

            if(numero > 0 && numero <= 23){
                jogadores[numero-1] += 1;
                cont++;
            }
            else if(numero != 0) {
                System.out.println("Número inválido!\nDigite um número entre 1 e 23 ou 0 para sair\n");
            }
        }while(numero != 0);

        calculaVotos(jogadores, cont);
        sc.close();
    }

    private static void calculaVotos(double[] jogadores, double totalVotos) {
        HashMap<Integer, Double> votados = new HashMap<Integer, Double>();

        for (int i = 0; i < jogadores.length; i++){

            if(jogadores[i] != 0){
                votados.put(i+1, jogadores[i]);
            }

        }
        calculaVencedor(votados, totalVotos);
    }

    private static void calculaVencedor(HashMap<Integer, Double> votados, double totalVotos) {
        double porcento, porcentagem = 0, votos = 0;
        int camisa = 0;

        System.out.println("==== RESULTADO DA VOTAÇÃO ====\n");

        System.out.printf("Foram computados %.0f votos\n", totalVotos);
        System.out.println("Jogador\tVotos");

        for(int i = 1; i <= 23; i++){
            if(votados.get(i) != null){
                porcento = (votados.get(i) * 100)/totalVotos;
                System.out.printf("%d  \t  %.0f  \t  %.2f%%\n", i, votados.get(i), porcento);
                if(porcentagem < porcento){
                    porcentagem = porcento;
                    camisa = i;
                    votos = votados.get(i);
                }
            }
        }
        System.out.printf("\nO melhor jogador foi o número %d, com %.0f votos, correspondendo a " +
                "%.2f%% dos votos.\n", camisa, votos, porcentagem);


    }
}
