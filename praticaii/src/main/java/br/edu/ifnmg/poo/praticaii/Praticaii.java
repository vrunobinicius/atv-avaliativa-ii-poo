/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.poo.praticaii;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Praticaii {

    public static void main(String[] args) {
        // CPF: 14230703058
        System.out.println("""
                           CPF: 14230703058
                           Resposta: """ + (Util.validarCpf(14230703058L) ? " Válido" : " Inválido") + "\n" );
        
        // CPF: 142.307.030-58
        System.out.println("""
                           CPF: 142.307.030-58
                           Resposta: """ + (Util.validarCpf("142.307.030-58") ? " Válido" : " Inválido") + "\n" );
        
        // CPF: 230703058
        System.out.println("""
                           CPF: 230703058
                           Resposta: """ + (Util.validarCpf(230703058L) ? " Válido" : " Inválido") + "\n" );
        
        // CPF: 002.307.030-58
        System.out.println("""
                           CPF: 002.307.030-58
                           Resposta: """ + (Util.validarCpf("002.307.030-58") ? " Válido" : " Inválido") + "\n" );
    }
}
