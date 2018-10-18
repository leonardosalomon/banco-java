package banco;

import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {

        Conta conta1;

        conta1 = new Conta(123, 900, 1000, "Samuel", "989.895.254-18", "Rua Coronel Lacerda N 450");

        System.out.println("Banco");

        //System.out.println("\nNome: " + conta1.getTitulares().get(0).nome);
        System.out.println("Numero da conta: " + conta1.getNumero());
        System.out.println("Saldo inicial: " + conta1.getSaldo());
        System.out.println("Limite: " + conta1.getLimite());

        boolean Sucesso = conta1.deposito(157.90f);

        if (Sucesso) {
            System.out.println("\n\nDepositado com sucesso");
            System.out.println(Sucesso);
        } else {
            System.out.println("\n\n\nNão foi possivel realizar o depósito");
            System.out.println(Sucesso);
        }

        //System.out.println("\nDepósito" + "\nNome: " + conta1.getTitulares().get(0).nome);
        System.out.println("\nSaldo após depósito: " + conta1.getSaldo());

        boolean Consegui = conta1.saque(2567.45f);

        if (Consegui) {
            System.out.println("\n\nSaque realizado com sucesso");
            System.out.println(Consegui);
        } else {
            System.out.println("\n\n\nNão foi possivel realizar o saque");
            System.out.println(Consegui);
        }

        System.out.println("\nSaque" + "\nSaldo após saque: " + conta1.getSaldo());

        conta1.setSaldo(1000f);

        Consegui = conta1.saque(2000);

        if (Consegui == true) {
            System.out.println("\n\nSaque realizado com sucesso");
            System.out.println(Consegui);
        } else {
            System.out.println("\n\n\nNão foi possivel realizar o saque");
            System.out.println(Consegui);

        }

        Conta conta2;

        conta2 = new Conta(456, 300, 2000, "Leo", "080.981.989-95", "Rua Marechal Fonseca");

        //  System.out.println("\nNome: " + conta2.getTitulares().get(1).nome);
        System.out.println("Numero da conta: " + conta2.getNumero());
        System.out.println("Saldo inicial: " + conta2.getSaldo());
        System.out.println("Limite: " + conta2.getLimite());

        System.out.println(conta1.getSaldo());

        conta1.transferencia(300, conta2);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        Conta conta3;

        conta3 = new Conta();

        System.out.println(conta3);

        conta2.getSaldo(10.5);

        ArrayList Contas = new ArrayList();

        Contas.add(conta1);
        Contas.add(conta2);

        System.out.println(Contas);

        conta1 = new Conta(456, 300, 2000, "Leo", "080.981.989-95", "Rua Marechal Fonseca");

        conta1.getTitulares().add(new Pessoa("dfd", "sdfd", "sdfd"));

        System.out.println(conta1.getTitulares().get(0).nome);
        System.out.println(conta1.getTitulares().get(1).nome);
    }

}
