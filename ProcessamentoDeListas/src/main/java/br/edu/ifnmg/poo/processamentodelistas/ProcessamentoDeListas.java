/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.poo.processamentodelistas;

import java.util.ArrayList;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class ProcessamentoDeListas {

    public static void main(String[] args) {
        ArrayList<Double> ins, outs;
        ins = new ArrayList<>();
        outs = new ArrayList<>();
        
        ins.add(1.0);
        ins.add(3.0);
        ins.add (5.0);
        
        outs.add(1.0);
        outs.add(3.0);
        outs.add (5.0);
        
        /*
        ins: 2.900000095, 6.699999809, 4.900000095, 7.900000095, 9.800000191, 6.900000095, 6.099999905,
        6.199999809, 6, 5.099999905, 4.699999809, 4.400000095, 5.800000191
        
        outs: 4, 7.400000095, 5, 7.199999809, 7.900000095, 6.099999905, 6, 5.800000191, 5.199999809,
        4.199999809, 4, 4.400000095, 5.199999809
        */
        
        /*
        ins.add(2.900000095);
        ins.add(6.699999809);
        ins.add (4.900000095);
        ins.add(7.900000095);
        ins.add(9.800000191);
        ins.add (6.900000095);
        ins.add(6.099999905);
        ins.add(6.199999809);
        ins.add (6.0);
        ins.add(5.099999905);
        ins.add(4.699999809);
        ins.add (4.400000095);
        ins.add (5.800000191);
        
        outs.add(4.0);
        outs.add(7.400000095);
        outs.add(5.0);
        outs.add(7.199999809);
        outs.add(7.900000095);
        outs.add(6.099999905);
        outs.add(6.0);
        outs.add(5.800000191);
        outs.add(5.199999809);
        outs.add(4.199999809);
        outs.add(4.0);
        outs.add(4.400000095);
        outs.add(5.199999809);
        */
        
        Dupla<Double,Double> w = MinhaClasse.metodo(ins, outs);
        System.out.println("w0= " + (w.w0) + "\n" + "w1= " + (w.w1));
    }
}
