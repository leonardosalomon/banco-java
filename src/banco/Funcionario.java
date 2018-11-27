/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Leonardo Salomon
 */
public class Funcionario extends Pessoa {

    String matricula;
    float salario;
    public static int totalDeFuncionarios = 0;

    public Funcionario(String nome, String cpf, String endereco, String matricula, float salario) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
        this.salario = salario;
        totalDeFuncionarios++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
       
    @Override
    public String toString() {
        return "" + this.matricula;
    }
    
}   
