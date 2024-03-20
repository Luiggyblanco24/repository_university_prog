package com.claseufpso.arraylists;

import java.util.ArrayList;

 class ArrayLists {

    public static void main(String[] args) {
        
        ArrayList <String> arrayList = new ArrayList <>();
        
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        
        arrayList.add("Hola"); 
        arrayList.add("mundo"); 
        arrayList.add("cruel"); 
        
         ArrayList <String> total = new ArrayList <>();
         total.add("nuevo");
         
         total.addAll(arrayList);
         
        
        arrayList.set(2, "bonito");
        arrayList.remove(0);
        
        
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
    }
}
