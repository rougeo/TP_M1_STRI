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
      String reponse;
      chaine=requete.split(" ");
      if(chaine[1].compareTo("CREATION")==0)
      {
          
      }
      else
          if(chaine[1].compareTo("POSITION")==0)
      {
          
      }
      else
          if(chaine[1].compareTo("AJOUT")==0)
      {
          
      }
      else
          if(chaine[1].compareTo("RETRAIT")==0)
      {
          
      }
      else
              reponse="ERREUR REQUETE INCORRECTE";
      
      
                  
        return reponse;
    }
    
}
