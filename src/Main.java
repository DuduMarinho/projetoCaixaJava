import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta" + tipoConta);
        System.out.println("Saldo da conta "+ saldo);
        System.out.println("\n********************");

        String menu = """
                ** Digite a opção desejada **
                1 - Consultar saldo
                2 - Transferir Valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor <= saldo){
                    System.out.println(saldo - valor);
                }
            }
        };

    }
}
