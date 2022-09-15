package com.mycompany.desafiodiobanco;

/**
 * @author Raphael Lazzarini
 */
public class DesafioDIOBanco {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        
        cc.imprimirExtrato();        
        poupanca.imprimirExtrato();
        
    }
}
