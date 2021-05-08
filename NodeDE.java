/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

/**
 *
 * @author fabio
 */
public class NodeDE <E>{
    E info;
    NodeDE next;
    NodeDE pre;
    
    NodeDE(E elem){
        info = elem;
        next = pre = null;
        
    }
}
