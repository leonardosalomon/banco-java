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
public interface InterfaceConta {
    
    public boolean saque(float valor);
    
    public boolean deposito(float valor);
    
    public boolean transferencia(float valor, Conta Destino);
    
    public void fechar();
}
