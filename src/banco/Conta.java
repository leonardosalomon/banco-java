package banco;

import java.util.ArrayList;
import javax.swing.*;

public class Conta implements InterfaceConta {

    //Atributos
    private ArrayList<Pessoa> titulares;
    ArrayList<Funcionario> funcionarios;
    ArrayList<Conta> Contas;
    private int numero;
    //private Pessoa titular;
    private String conta;
    private float saldo, limite;
    public static int totalDeContas = 0;

    public Conta() {
        this.numero = 0;
        this.titulares = new ArrayList<Pessoa>();
        this.saldo = 0;
        this.limite = 0;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitulares(ArrayList<Pessoa> titulares) {

        this.titulares.clear();

        for (Pessoa Titular : titulares) {
            this.titulares.add(Titular);
        }

    }

    public ArrayList<Pessoa> getTitulares() {
        return titulares;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getConta() {
        return conta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    //Outra possibilidade
    //public Conta(int numero, float saldo, float limite, Pessoa titular) {
    public Conta(int numero, float saldo, float limite, String nome, String cpf, String endereco) {
        this.numero = numero;
        //this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;

        this.titulares = new ArrayList<Pessoa>();

        this.titulares.add(new Pessoa(nome, cpf, endereco));

        this.totalDeContas++;
    }

    public Conta(int numero, float saldo, float limite, ArrayList<Pessoa> titulares) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;

        this.titulares = new ArrayList<Pessoa>();

        this.setTitulares(titulares);

    }

    //Comportamentos   Métodos 
    public boolean saque(float valor) {
        //this.saldo = this.saldo - valor;
        if ((this.saldo + this.limite) < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }

    }

    public boolean deposito(float valor) {
        this.saldo += valor;
        return true;
    }

    public boolean transferencia(float valor, Conta destino) {
        boolean saque = true;
        if (saque == true) {
            this.saque(valor);
            destino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public void fechar() {

//        for (int i = 0; i < Contas.size(); i++) {
//                if (Contas.get(i).getNumero() == rm) {
//                    Contas.remove(i);
//                }
//            }
    }

    public boolean getSaldo(double valor) {
        this.saldo += valor;
        System.out.println("Seu saldo é " + this.saldo);
        return true;
    }

    public boolean adicionaTitular(String nome, String cpf, String endereco) {

        Pessoa titular = new Pessoa(nome, cpf, endereco);
        this.titulares.add(titular);

        return true;

    }

    @Override
    public String toString() {
        return "" + this.numero;
    }

}
