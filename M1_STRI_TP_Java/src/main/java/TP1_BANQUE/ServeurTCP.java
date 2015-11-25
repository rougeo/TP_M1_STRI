/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1_BANQUE;

import java.util.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author BoubacarSidy
 */
public class ServeurTCP {

ServerSocket sockEcoute;                   // Déclaration du ServerSocket 

    public ServeurTCP(){
    //  Instanciation du ServerSocket en utilisant le constr. le plus simple (choix port) 
        try { 
               sockEcoute = new ServerSocket(13214); 
        } 
        catch(IOException ioe) { 
              System.out.println("Erreur de création du server socket: " + ioe.getMessage()); 
              return; 
        }
    }
 
    public void traitementTCP(){

        Socket sockService;
        String requete;
        BufferedReader fluxEntre;
        PrintStream fluxSortant;
        
        GestionProto gestion=new GestionProto();
        while(true) { 
              try { 
                    sockService = sockEcoute.accept(); 
              } 
              catch(IOException ioe) { 
                    System.out.println("Erreur de accept : " + ioe.getMessage()); 
                    break;                     
              } 
              try{ 
              //  Instancie un BufferedReader travaillant sur un InputStreamReader lié à
              // l’input stream de la socket 
              fluxEntre = new BufferedReader 
                            (new InputStreamReader(sockService.getInputStream())); 
              fluxSortant = new PrintStream(sockService.getOutputStream()); 
              //  Lit une ligne de caractères depuix le flux, et donc la reçoit du client 

              while((requete=fluxEntre.readLine())!=null)
              {
                 fluxSortant.println(gestion.traitement(requete));
              
              }
              } 
                catch(IOException ioe) { 
                      System.out.println("Erreur de lecture : " + ioe.getMessage()); 
                } 
              
        }
    }
}
