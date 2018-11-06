package banco;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class Conta {

    //Atributos
    private ArrayList<Pessoa> titulares;
    ArrayList<Funcionario> funcionarios;
    private int numero;
    //private Pessoa titular;
    private String conta;
    private float saldo, limite;

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
    
    

}
