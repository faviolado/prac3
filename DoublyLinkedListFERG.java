/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Interface.MyListFERG;

/**
 *
 * @author fabio
 */
public class DoublyLinkedListFERG <E> implements MyListFERG <E>{

    private NodeDE head;//nodo principal, cabecera, del que dependen el resto de nodos
    
    private NodeDE tail;
    
    public void list(){
        head = null; //metodo lista para implementar la lista
        tail = null;
    }
    
    @Override
    //devuelve el tamaño de la lista
    public int size() {
        
        if(head != null){
        NodeDE temp = head; 
        int cont = 0; 
        while (temp != null) 
        { 
            cont++; 
            temp = temp.next; 
        } 
        return cont;
        } else if (this.isEmpty() == true){
            System.out.println("La lista esta vacia");
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        //muestra si una lista esta vacia o no
        if (head == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E get(int index) {
        if(this.size() > 0 && this.size()>=index+1){//se ejecuta si la lista contiene elementos y el indice indica
                                                    //un lugar apropiado segun el tamaño de la lista
            NodeDE temp = head;
            int cont = 0;
            while(index != cont){
                cont++;
                temp=temp.next;
            }
            return (E) temp.info;
            
        } else if (this.size() == 0){//se ejecuta si la lista esta vacia
            
            throw new IllegalArgumentException("La lista está vacía");
            
        } else if (index+1 > this.size() || index<0){//se ejecuta si el indice es superior a al tamaño de la lista
            
            throw new IllegalArgumentException("Indice no permitido");
            
        }
        
        return null;
    }

    @Override
    public E set(int index, E elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, E elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFirst(E elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast(E elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cleanList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchElem(E elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existElem(E elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
