/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author lucas
 */
public class ListaEncadeada {
    
    public Node lista;
    
    public ListaEncadeada(){
        lista = null;     
    }       
    
    public void inserePrimeiro(int info){ 
        Node novaNode = new Node();
        novaNode.informacao = info;
        novaNode.proximo = lista;
        lista = novaNode; 
    }    
   
    public void insereOrdenado(int info){ 
        Node novaNode = new Node();
        novaNode.informacao = info;
        
        if (lista == null || lista.informacao >= info)  
        { 
            novaNode.proximo = lista;
            lista = novaNode;            
        } 
        else { 
            Node temp = lista;
            while (temp.proximo != null && temp.proximo.informacao < info) { 
                temp = temp.proximo;
            } 
            novaNode.proximo = temp.proximo;
            temp.proximo = novaNode;
        } 
    } 
    
}
