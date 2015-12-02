/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1_BANQUE;

import java.util.*;
import java.util.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author BoubacarSidy
 */
public class ClientTCP {
    
    public ClientTCP(String NomServeur, int Numport){
        
        
        Socket client = null;
        PrintStream fluxSortant = null;
        BufferedReader fluxEntrant = null;

        try {
            // echoSocket = new Socket("taranis", 7);
            client = new Socket(NomServeur, Numport);
            fluxSortant= new PrintStream(client.getOutputStream());
            fluxEntrant = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
          }catch(IOException ioe) { 
              System.out.println("Erreur de création du Client socket: " + ioe.getMessage()); 
              return; 
        }
    
    
 }   
      
    public void traitementTCP() throws IOException{
       
        String requete;
        BufferedReader entreeClavier = new BufferedReader(new InputStreamReader(System.in));
	        
        while(true){
            System.out.print ("\n Saisir une requete: ");
            requete = entreeClavier.readLine();
	    fluxSortant.println(requete);
	    System.out.println("REPONSE: \n" + fluxEntrant.readLine());
           
	}
        client.close();
    }
}
