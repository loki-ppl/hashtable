/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TabelaHash t = new TabelaHash();                

        t.fill();        
        
        t.imprime();       
        
        while (true){
            System.out.println("\n\nEntre com a key para busca: ");
            Scanner in = new Scanner(System.in);
            int key = in.nextInt(); 
                if(key == -1){
                    break;
                }
                else{
                    if(t.busca(key) == true) System.out.println("existe");
                    else System.out.println("nao existe");
            }    
        }
        
        
        
        
        
        
        
               
        
        
        
        //
    }
}
