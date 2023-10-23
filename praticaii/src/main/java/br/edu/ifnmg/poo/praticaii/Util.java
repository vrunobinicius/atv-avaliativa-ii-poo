/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.praticaii;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Util {

    public Util() {
    }
    
    public static int obterDigito(long numero, int posicao){
        String numeroS = Long.toString(numero);
        if (posicao < numeroS.length() || posicao > numeroS.length()) { return -1; }
        char algarismoChar = numeroS.charAt(posicao);
        return Character.getNumericValue(algarismoChar);
    }
    
    public static boolean validarCpf(long cpf){
        if (((Long) cpf).toString().length() < 11){ return false; }
        int digVer = 0;
        int i;
        for (i = 1; i <= 9; i++) { digVer += i * obterDigito(cpf, i - 1); }
        
        int resto = digVer % 11;
        
        if (resto > 9) { resto = 0; }
        
        int peso = 0;
        for (i = 0; i < 9; i++) { peso += i * obterDigito(cpf, i); }
        peso += i * digVer;
        
        int resultado = peso % 11;
        
        if ((obterDigito(cpf, 9) == resto) && (obterDigito(cpf, 10) == resultado)) { return true; }
        return false;
    }
    
    public static boolean validarCpf(String cpf){
        String newCpf = cpf.replaceAll("[.-]", "");
        long numero = Long.parseLong(newCpf);
        return Util.validarCpf(numero);
        
    }
}
