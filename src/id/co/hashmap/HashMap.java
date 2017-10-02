/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.hashmap;

import java.util.HashSet;

/**
 *
 * @author Aris
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//membuat set
HashSet set = new HashSet();
//tambahkan elemen ke dalam set
set.add("One");
set.add("Two");
set.add("Three");
//tidak boleh elemen yang ganda
set.add("One");
//tampilkan isi set
System.out.println(set);
    }
    
}
