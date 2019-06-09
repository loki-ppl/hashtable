/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TabelaHash {
    
    public int colisao;
    NodeTabela tabela[];
    public int hash;
    
    public TabelaHash(){
        System.out.println("Digite o tamanho da tabela: ");
        Scanner in = new Scanner(System.in); 
        int size = in.nextInt();        
        tabela = new NodeTabela[size] ;    
        hash = size;
        
        for (int i = 0;i<tabela.length;i++){
        tabela[i] = new NodeTabela();     
        tabela[i].lista = new ListaEncadeada();
        tabela[i].informacao = -1;        
        colisao = 0;
        }
    }
    
    public void fill(){
        Random rand = new Random();
        for(int i = 0; i < tabela.length*0.9; i++){
            insere(rand.nextInt(1000000));         
        }
    }
    
    public void insere(int info){
        if (tabela[hash(info)].informacao != -1){
            colisao++;   
            tabela[hash(info)].lista.insereOrdenado(info); 
        }        
        else tabela[hash(info)].informacao = info;       
    }
    
    public int hash(int key){
        return key % hash;
    }            
    
    public void imprime(){
        for (int k = 0; k < tabela.length; k++){
            System.out.print("\nindex: "+k+" key: "+tabela[k].informacao); 
        if(tabela[k].lista != null){ 
            Node temp = tabela[k].lista.lista;        
            while(temp != null){
            System.out.print(" ["+temp.informacao+"]");             
            temp = temp.proximo;
                    }        
                }
        }
        }
    
    public boolean busca(int key){
        if (tabela[hash(key)].informacao == -1){
            return false;        
        }
        else{
            if(tabela[hash(key)].informacao == key){
                return true;
            }
            else{
                Node temp = tabela[hash(key)].lista.lista;   
                while(temp.informacao == key || temp.proximo != null ){
                    if (temp.informacao == key) return true;
                    else temp = temp.proximo;                    
                    }
                }            
            }                    
            return false;
        }
    
               

    }
    
    
    
    

    
    
      
    

