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
public class Gerente extends Funcionario {
  
    public static int totalDeGerente = 0;

    public Gerente(String nome, String cpf, String endereco, String matricula, float salario) {
        
        super(nome, cpf, endereco, matricula, salario);
        totalDeGerente++;
        
    }

    
}
