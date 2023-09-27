package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    Cliente referenciaCliente = new Cliente();

    Conta referenciaConta = new Conta();

    public void executarMenu(){

        boolean continuar = true;

        while (continuar) {
            System.out.println("//-------- Menu --------//");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Gerar Conta");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Realizar Deposito");
            System.out.println("5 - Realizar Saque");
            System.out.println("6 - Realizar Transferência");
            System.out.println("7 - Sair");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente();
                    referenciaCliente.adicionarCliente(cliente);
                    break;

                case 2:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfTitular = scanner.nextLong();
                    scanner.nextLine();

                    Cliente clienteTitular = referenciaCliente.pesquisarCliente(cpfTitular);
                    if(clienteTitular != null){
                        Conta conta = new Conta();
                        conta.gerarConta(clienteTitular);
                        referenciaConta.adicionarContaList(conta);
                    }


                    break;

                case 3:
                    referenciaConta.consultarSaldo();
                    break;

                case 4:
                    System.out.println("Informe o valor de depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    referenciaConta.realizarDeposito(valorDeposito);
                    break;

                case 5:
                    System.out.println("Informe o valor de saque: ");
                    double valorSaque = scanner.nextDouble();
                    referenciaConta.realizarSaque(valorSaque);
                    break;

                case 6:


                case 7:
                    continuar = false;
                    break;
            }
        }
    }
}
