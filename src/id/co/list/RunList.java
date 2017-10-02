package id.co.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aris
 */
public class RunList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat List dengan batasan data berupa String
        //Nama alias adalah kota
       List<String>kota=new ArrayList<String>();
       //Menambahkan data kota ke dalam List
       kota.add("Jakarta");
       kota.add("Bandung");
       //Mendaptakan List kota dengan indeks 0
       String nama=kota.get(0);
       System.out.println(nama);
       //Mendapatkan List kota dengan indeks 1
       String nama2=kota.get(1);
       System.out.println(nama2);
       
       //Membuat List dengan batasan data objek berupa Integer
       //Nama alias adalah angka
       List<Integer> angka=new ArrayList<Integer>();
   
       //Menambahkan data angka Integer ke dalam List
       angka.add(new Integer(9));
       angka.add(new Integer(100));
       //Mendapatkan List angka dengan indeks 0
       Integer bil=angka.get(0);
       //Mendapatkan List angka dengan indeks 1
       Integer bil2=angka.get(1);
       System.out.println("\n"+bil+"\n"+bil2);
       
       //List dengan batasan object Double
       List<Double>ganda=new ArrayList<Double>();
       //Menambahkan data objek Double ke dalam List
       double harga=1000.0;
       ganda.add(harga);
       //Atatu bisa juga
       ganda.add(new Double(1500.0));
       
       //Mendapatkan indeks ke 0 dan 1 dari List ganda
       double ganda1=ganda.get(0);
       double ganda2=ganda.get(1);
       //Menampilkan List dengan index
       System.out.println("\n"+ganda1+"\n"+ganda2);
       //Menampilkan semua data dari List
       System.out.println("List ganda : "+ganda);
       //Mendapatkan ukuran dari suatu List
       int ukuranKota=kota.size();
        System.out.println("Ukuran kota : "+ukuranKota);
        
        int ukuranAngka=angka.size();
        System.out.println("Ukuran angka : "+ukuranAngka);
        
        int ukuranDouble=ganda.size();
        System.out.println("UKuran ganda : "+ukuranDouble);
        
        //menghapus List dengan indeks 0
        angka.remove(0);
        System.out.println("Angka dengan indeks 0 telah diganti dengan : "+angka.get(0));
        
        
        //Versi lain penulisan List
        List list=new ArrayList();
        list.add("Hallo");
        list.add(new Integer(1));
        list.add(new Double(10.2));
        list.add(kota);
        //Insert objek String baru ke dalam List dengan index 0
        list.add(0,"Hulla");
        //Insert objek Double baru ke list dengan index 2
        list.add(2,new Double(1000.0));
        //Insert objek Integer baru ke dalam list
        list.add(4,new Integer(876));
        //Insert objek berupa List dari angka ke dalam list
        list.addAll(angka);
        //Insert objek berupa List dari List dengan index 1
        list.addAll(1,ganda);
        int ukuran=list.size();
        
        
        //Menampilkan semua data List dari list
        System.out.println("Ukuran list : "+ukuran);
        //Menampilkan data List list dengan index 2
        //int index2=list.get(1); --->Ini error karena index ke 2 adalah String, sehingga tidak bisa di cast ke Integer
        //Gunakan for untuk menampilkan index dengan tipe objek tertentu :
       for(Object o:list){
           if(o instanceof Object){
               System.out.println("List berupa objek dari List lain : "+o);
           }
       }
       //
       for(Object o:list){
           if(o instanceof Integer){
               System.out.println("List berupa Integer : "+o);
           }
       }

       //Penggunaan Iterator
      Iterator i=list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }

    }
    
}
