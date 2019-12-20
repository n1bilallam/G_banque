/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexams5;

/**
 *
 * @author AM
 */
public class Propritaire implements Client
{ 
  private String nom; 
  private String cin;
  
 @Override
  public String identification() {
      return "Votre nom : "+nom+"\n"+"Carte d'identite : "+cin;
  }
  
  Propritaire (String unNom,String unadress)
   {
     nom = unNom;
     cin = unadress;
   }
   
  public String getNom()
  {
    return (nom);
  }  
  
    public String geAdress()
  {
    return (cin);
  } 
    
  @Override
  public String toString() {
      return identification();
  }
}

