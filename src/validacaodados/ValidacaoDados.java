package validacaodados;

import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadastrar[] = new String[]{"Nome", "Genero", "RG", "CPF"};
        String dados[] = new String[4];

        System.out.println("===== CADASTRO DE CLIENTE =====\n");
        for (int cont = 0; cont < cadastrar.length; cont++) {
            System.out.printf("Informe o seu %s: ", cadastrar[cont]);
            dados[cont] = sc.nextLine();

            if(dados[cont].equals("")){
                System.out.println("\nPor favor, preencha todos os dados!\n");
                cont--;
            }
        }
        System.out.println("\nDados recebidos com sucesso!");
        sc.close();
    }
}
