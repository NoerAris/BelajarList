
package id.co.hashmap;

import java.util.HashSet;

/**
 *
 * @author Aris
 */
public class HashMap {
int jumlah;

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
for(Object o:set){
    if(o instanceof  String){
        System.out.println("Tampilkan sorted list : "+o);
    }
}
    }
    
}
