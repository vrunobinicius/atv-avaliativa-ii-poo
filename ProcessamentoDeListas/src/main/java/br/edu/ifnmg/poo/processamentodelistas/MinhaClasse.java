/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.processamentodelistas;

import java.util.ArrayList;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class MinhaClasse {
    
    public static Dupla<Double, Double> w = new Dupla<>();
    private static Double p = 0.0;
    private static Double dif = 0.0;
    private static Double lr = 0.025;
    private static Integer e = 2000;

    public MinhaClasse() {
    }
    
    public static Dupla<Double, Double> metodo(ArrayList<Double> ins, ArrayList<Double> outs){
        w.w0 = 0.0;
        w.w1 = 0.0;
        Double in = 0.0;
        Double out = 0.0;
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < ins.size(); j++) {
                in = ins.get(j);
                out = outs.get(j);
                p = w.w1 * in + w.w0;
                dif = out - p;
                w.w0 += dif * lr;
                w.w1 += dif * lr * in;
                
                if ((i % 10) == 0 && j == 0) { System.out.println("w1= " + w.w1 + " " + "w0= " + w.w0); }
            }
        }
        return w;  
    }
    
    public static Dupla<Double, Double> metodo(ArrayList<Double> ins, ArrayList<Double> outs, Integer e){
        MinhaClasse.e = e;
        return MinhaClasse.metodo(ins, outs);
        
    }
    
    public static Dupla<Double, Double> metodo(ArrayList<Double> ins, ArrayList<Double> outs, Integer e, Double lr){
        MinhaClasse.e = e;
        MinhaClasse.lr = lr;
        return MinhaClasse.metodo(ins, outs);
        
    }
}
