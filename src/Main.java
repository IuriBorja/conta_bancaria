import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Iuri Borja";
        String tipoConta = "Corrente";
        double saldo = 2500;

        String menu = """
                ****************************
                                
                Dados iniciais do cliente:
                                
                Nome:\s""" + nome + """
                Tipo de conta:\s""" + tipoConta + """
                Saldo inicial: €\s""" + saldo + """
                                
                ****************************
                                
                Operações
                                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                                
                Digite a opção desejada:
                """;


        double valorReceber;

        double valorTransferir;

        String opcaoMenu = "";

        double total = saldo;

        do {

            System.out.println(menu);

            opcaoMenu = leitura.nextLine();

            switch (opcaoMenu) {
                case "1" -> {

                    System.out.println("Saldo atualizado: € " + total);

                }
                case "2" -> {
                    System.out.println("Informe o valor a receber:");
                    valorReceber = leitura.nextDouble();
                    total = valorReceber + saldo;
                    System.out.println("Saldo atualizado: € " + total);
                }
                case "3" -> {
                    System.out.println("Informe o valor que deseja transferir:");
                    valorTransferir = leitura.nextDouble();

                    if (valorTransferir > total) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    } else {
                        total -= valorTransferir;
                        System.out.println("Saldo atualizado: € " + total);
                    }

                }
                case "4" -> System.out.println("Finalizando...");
                default -> System.out.println("erro");
            }


        } while (!opcaoMenu.equals("4"));


    }

}
