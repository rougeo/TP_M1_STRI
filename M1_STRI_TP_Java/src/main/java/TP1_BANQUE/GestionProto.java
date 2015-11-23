/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1_BANQUE;

/**
 *
 * @author BoubacarSidy
 */
public class GestionProto {
    private BanqueSimple banque;
    
    public GestionProto(){
        banque=new BanqueSimple();
    }
    
    
    public String traitement(String requete)
    { String chaine[];
      chaine=requete.split(" ");
         
        return requete;
    }
    
}
