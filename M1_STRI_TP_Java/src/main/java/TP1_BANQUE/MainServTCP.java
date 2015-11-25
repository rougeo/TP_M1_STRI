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
public class MainServTCP {
    
    public static void main(String args[])  {	
        
        ServeurTCP serv1=new ServeurTCP();
        
        serv1.traitementTCP();
        
    }
    
}
