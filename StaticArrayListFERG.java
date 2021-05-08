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
 * @param <E>
 */
public class StaticArrayListFERG<E> implements MyListFERG<E> {
    
    public static final int LENGTH = 6;//longitud máxima del array
    private E[] elems;//array para almacenar los elementos
    private int size=0;//numero de elementos

    
    public StaticArrayListFERG(int length){
        elems =(E[]) new Object[length];
    }
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        } else{
        return false;
                }
    }

    @Override
    public E get(int index) {
        //devuelve el elemento del indice indicado
        if(this.isEmpty()==false && index<size && index>=0){
            
            return elems[index];
            
        } else if(size == 0){
            //lanza una excepcion si la lista esta vacia
            throw new IllegalArgumentException("La lista está vacía");
        
        } else if(index+1 >= size || index < 0){
            //lanza una excepcion si el indice no apunta a un elemento de la lista
            throw new IllegalArgumentException("Indice no permitido");
            
        } 
        
        return null;
    
    }

    @Override
    public E set(int index, E elem) {
        
        if(size > 0 && size>=index+1){//se ejecuta si la lista contiene elementos y el indice indica
                                                    //un lugar apropiado segun el tamaño de la lista
        E aux;//auxiliar para recoger el elemento antiguo
        aux = elems[index];
        elems[index]= elem;
                                                    
        return aux;
        
        } else if (size == 0){//se ejecuta si la lista esta vacia
            
            throw new IllegalArgumentException("La lista está vacía");
            
        } else if (index+1 > size || index<0){//se ejecuta si el indice es superior a al tamaño de la lista
            
            throw new IllegalArgumentException("Indice no permitido");
            
        }
        
        return null;
        
    }

    @Override
    public void add(int index, E elem) {
        
        if(this.isEmpty()==false && index == size){//para añadir al final de la lista cuando no está vacía
        
            elems[index]=elem;   
            size++;
        
        }else if(this.isEmpty() == false && index<size && index>=0){//para añadir al principio y entre de medias de la lista cuando no esta vacia
            
            for( int i= size-1 ; i>= index ; i--){
                elems[i+1]=elems[i];
            }
            elems[index]=elem;
            size++;
            
        } else if (this.isEmpty() == true && index == 0){//para crear un nodo en una lista vacía
        
            elems[0]=elem;
            size++;
            
        } else if((this.isEmpty()== true && (index>0 || index<0)) || (this.isEmpty()==false && (index > size-1 || index<0))){
            //el indice introducido no está dentro del espacio de la lista
            throw new IllegalArgumentException("Indice no permitido");
        
        } else if(size==elems.length){
            //si la lista esta llena no recogerá más información
            throw new IllegalStateException("La lista esta llena");
            
        }
    }

    @Override
    public E remove(int index) {
        
        E aux;
        if(this.isEmpty() == false && index<size && index>=0){//para eliminar elementos en toda la lista 
            
            aux=elems[index];
            for( int i= index ; i< size-1 ; i++){
                elems[i]=elems[i+1];
            }
            elems[size-1]=null;
            size--;
            return aux;
            
        }else if((this.isEmpty()== true && (index>0 || index<0)) || (this.isEmpty()==false && (index > size-1 || index<0))){
            //el indice introducido no está dentro del espacio de la lista
            throw new IllegalArgumentException("Indice no permitido");
        
        } else if(this.isEmpty()==true && size == 0){
            //si la lista esta llena no recogerá más información
            throw new IllegalStateException("La lista ya esta vacia");
            
        }
        return null;
    }

    @Override
    public void addFirst(E elem) {
        //añade un elementos al principio de la lista
        if(size<elems.length){    
            for( int i= size-1 ; i>= 0 ; i--){
                elems[i+1]=elems[i];
            }
            elems[0]=elem;
            size++;
            
        }    else if(size==elems.length){
            //si la lista esta llena no recogerá más información
            throw new IllegalStateException("La lista esta llena");
            
        }
    }

    @Override
    public void addLast(E elem) {
        //añade un elemento al final de la lista 
        if(size<elems.length){    
            
            elems[size]=elem;   
            size++;
            
        }    else if(size==elems.length){
            //si la lista esta llena no recogerá más información
            throw new IllegalStateException("La lista esta llena");
            
        }
    }
        
    

    @Override
    public void removeFirst() {
        //borra el primer elemento de la lista
        if(size>0){
            for( int i= 0 ; i< size-1 ; i++){
                elems[i]=elems[i+1];
            }
            elems[size-1]=null;
            size--;
        } else {
            //si la lista la esta vacia no se puede borrar mas elementos
            throw new IllegalStateException("La lista ya esta vacia");
            
        }
            
    }

    @Override
    public void removeLast() {
        //borra el ultimo elemento de la lista
        if(size>0){
        
            for( int i= size ; i< size-1 ; i++){
                elems[i]=elems[i+1];
            }
            elems[size-1]=null;
            size--;
            
        }else {
            //si la lista la esta vacia no se puede borrar mas elementos
            throw new IllegalStateException("La lista ya esta vacia");
            
        }
    }

    @Override
    public void cleanList() {
        //para limpiar la lista entera
        if(size>0){
            while(size!=0){
            for( int i= 0 ; i< size-1 ; i++){
                elems[i]=elems[i+1];
            }
            elems[size-1]=null;
            size--;
            }
        } else {
            //si la lista la esta vacia no se puede borrar mas elementos
            throw new IllegalStateException("La lista ya esta vacia");
            
        }
        
    }

    @Override
    public int searchElem(E elem) {
        //para buscar un elemento en la lista
        if(size>0){
            for (int i=0; i<size;i++){
                if(elems[i]==elem){
                    System.out.print("El elemento "+ elem + " existe en la lista: ");
                    return i;
                } 
            }
            
        } 
        //el elemento introducido no existe o la lista esta vacia
        System.out.print("El elemento buscado no existe en la lista: ");
        return -1;
        
    }

    @Override
    public boolean existElem(E elem) {
        //devuelve true o false si existe o no el elemento en la lista
        if( this.searchElem(elem)== -1 ){
            
            return false;
        
        } else{
            
            return true;
        }
    }
    
}
