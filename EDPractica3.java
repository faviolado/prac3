/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edpractica3;

import Implements.MyLinkedListFERG;
import Implements.StaticArrayListFERG;
import Implements.DynamicArrayListFERG;
import Interface.MyListFERG;
/**
 *
 * @author fabio
 */
public class EDPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // MyListFERG <String> list = new MyLinkedListFERG <String>(); 
        MyLinkedListFERG  list1 = new MyLinkedListFERG ();
        
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////LISTA ENLAZADA PRUEBAS//////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
          /*list1.add(0,"No");
           System.out.println(list1.get(0));
           /*int x =list1.size();
           System.out.println(x);
           list1.remove(0);
           x =list1.size();
           System.out.println(x);*/
          /* list1.add(1, "Vas a suspender");
           list1.add(2,"sobre");
           list1.add(3,"todo");
           list1.add(4, "si estudias");
           
        /*for( int i=0 ; i<5 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.add(2,80);
        for( int i=0 ; i<6 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.set(5,0.1);
        for( int i=0 ; i<6 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.remove(0);
        for( int i=0 ; i<5 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.remove(4);
        for( int i=0 ; i<4 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.remove(2);
        for( int i=0 ; i<3 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.set(0,4);
        for( int i=0 ; i<3 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.set(2,true);
        
        for( int i=0 ; i<3 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.set(1, "xddd");
        for( int i=0 ; i<3 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.add( 0 , "holaaaa" );
        for( int i=0 ; i<4 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.addFirst("caca");
        for( int i=0 ; i<5 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.addLast("pis");
        for( int i=0 ; i<6 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.remove(0);
        for( int i=0 ; i<5 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.remove(4);
        for( int i=0 ; i<4 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.remove(2);
        for( int i=0 ; i<3 ; i++ ){
            System.out.println(list1.get(i));
        }
        
        list1.cleanList();
        list1.add(0, "nicoarci17");
        list1.add(1, "como digas algo estás muerto");
        list1.add(2, "muy muertooooOOOOOOO >:)");
        int x;
        x = list1.searchElem(2);
        System.out.println(x);
        
        for (int i=0; i<3; i++){
            System.out.println(list1.get(i));
        }
        
        boolean t;
        t = list1.existElem(2);
        System.out.println(t);
        
        int s;
        s=list1.size();
        System.out.println(s);
        
        list1.cleanList();
        list1.add(0,1);
        list1.add(1,4);
        list1.add(2,5);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        */
          
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////LISTA ESTÁTICA PRUEBAS//////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        /*StaticArrayListFERG list2 = new StaticArrayListFERG(6);
        list2.add(0,0);
        list2.add(1,1);
        list2.add(2,3);
        list2.add(2,2);
        list2.add(4,4);
        list2.add(5,5);
        list2.removeFirst();
        list2.removeLast();
        for (int i=0; i<4;i++){
        System.out.println(list2.get(i));
        }
        list2.addFirst("new 0");
        list2.addLast("new 5");
        for (int i=0; i<6;i++){
        System.out.println(list2.get(i));
        }
        list2.removeLast();
        list2.add(1, 11);
        for (int i=0; i<6;i++){
        System.out.println(list2.get(i));
        }
        int x;
        
        x = list2.searchElem("new 0");
        System.out.println(x);
        
        x = list2.searchElem(4);
        System.out.println(x);
        
        x = list2.searchElem(100);
        System.out.println(x);
        
        boolean t;
        t=list2.existElem("new 0");
        System.out.println(t);
        
        t = list2.existElem(4);
        System.out.println(t);
        
        t = list2.existElem(100);
        System.out.println(t);
        for (int i=0; i<7;i++){
        System.out.println(list2.get(-1));
        }*/
        
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////LISTA DINÁMICA PRUEBAS//////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        /*DynamicArrayListFERG list3 = new DynamicArrayListFERG(6);
        list3.add(0,0);
        list3.add(1,1);
        list3.add(2,3);
        list3.add(2,2);
        list3.add(4,4);
        list3.add(4,5);
        list3.add(3,4);
        
        for (int i=0; i<7;i++){
        System.out.println(list3.get(i));
        }
        list3.set(6,10000);
        for (int i=0; i<7;i++){
        System.out.println(list3.get(i));
        }
        
        list3.remove(0);
        list3.remove(3);
        list3.remove(4);
        for (int i=0; i<4;i++){
        System.out.println(list3.get(i));
        }
        
        list3.removeFirst();
        list3.removeLast();
        for (int i=0; i<2;i++){
        System.out.println(list3.get(i));
        }
        */
        
        
        
        MyLinkedListFERG<String> ciudadesAndaluzas = new MyLinkedListFERG<>();
        MyLinkedListFERG<String> ciudadesCastillaLeon = new MyLinkedListFERG<>();
        StaticArrayListFERG <MyLinkedListFERG<String>> comunidadesAutonomas = new StaticArrayListFERG<>(5);
    ciudadesAndaluzas.addLast("Cádiz");
    ciudadesAndaluzas.addLast("Sevilla");

    ciudadesCastillaLeon.addLast("Valladolid");
    ciudadesCastillaLeon.addLast("Soria");

    comunidadesAutonomas.add(0, ciudadesAndaluzas);
    comunidadesAutonomas.addLast(ciudadesCastillaLeon);

    System.out.println(comunidadesAutonomas.get(1).toString());
}
    }
        
    }
        
        
        
        
        
    
    
    
    

