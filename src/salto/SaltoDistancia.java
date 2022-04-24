package salto;

import java.util.Scanner;

public class SaltoDistancia {
    public static void main(String[] args) {

        String[][] dados = new String[5][6];

        System.out.println("==== SALTOS A DISTANCIA ====\n");

        registroSaltos(dados);

    }
    private static void registroSaltos(String[][] dados) {
        Scanner sc = new Scanner(System.in);

        String infos[] = new String[]{"Informe o nome do atleta: ","Informe a metragem do 1o salto: ",
                "Informe a metragem do 2o salto: ", "Informe a metragem do 3o salto: ",
                "Informe a metragem do 4o salto: ", "Informe a metragem do 5o salto: "};

        for(int l = 0; l < 5; l++){
            for (int c = 0; c < 6; c++){
                System.out.printf("\n"+infos[c]);
                dados[l][c] = sc.next();
            }
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
        resultadoSaltos(dados);
    }
    private static void resultadoSaltos(String[][] dados) {
        String ordem[] = new String[] {"Atleta: ", "Primeiro Salto: ","Segundo Salto: ","Terceiro Salto: ",
                                        "Quarto Salto: ", "Quinto Salto: "};

        for(int l = 0; l < 5; l++){
            double media = 0;
            for (int c = 0; c < 6; c++){
                System.out.println(ordem[c] + dados[l][c]);

                if(c > 0){
                    double salto = Double.parseDouble(dados[l][c]);
                    media += salto;
                }

            }
            System.out.println("\n=== Resultado Final ===\n");
            System.out.println("Atleta: "+dados[l][0]);
            System.out.printf("Saltos: %s - %s - %s - %s - %s", dados[l][1], dados[l][2], dados[l][3],
                                dados[l][4], dados[l][5]);
            System.out.printf("\nMedia dos saltos: %.2f", media/5);
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
    }
}
