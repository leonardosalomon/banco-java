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

    Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Funcionario(String nome, String cpf, String endereco, String matricula, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.matricula = matricula;
        this.salario = salario;
        
        totalDeFuncionarios++;
    }
    
    @Override
    public String toString() {
        return "" + this.matricula;
    }
    
}   
