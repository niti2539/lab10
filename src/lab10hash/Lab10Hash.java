/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10hash;

import java.util.Arrays;

/**
 *
 * @author Bank
 */
public class Lab10Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuadraticProbingHash hashset1=new QuadraticProbingHash(11);
        hashset1.add(455);
        hashset1.add(555);
        hashset1.add(655);
        hashset1.add(732);
        hashset1.add(123);
        hashset1.add(452);
        hashset1.add(885);
        hashset1.add(500);
        hashset1.add(369);
        hashset1.printHashTable();
        hashset1.remove(555);
        hashset1.printHashTable();
        hashset1.add(685);
        hashset1.printHashTable();
    }
    
}
