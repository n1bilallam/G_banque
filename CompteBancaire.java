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
public class CompteBancaire {
  static long nbComptes=0;

    private final Client proprietaire;
    protected double solde;
    private final long numeroCompte;
    
   

    CompteBancaire (Client proprietaire) 
    {
      this.proprietaire=proprietaire;
      nbComptes=nbComptes+1;	
      numeroCompte=nbComptes;
      
     }

    public double getSolde() {
        return solde;
    }	  

    public long getNumeroCompte() {
        return numeroCompte;
    }
    
   

    public Client getProprietaire() {
        return proprietaire;
    }

    
  
    public double depot(double montant) {
            solde=solde+montant;
            return solde;
    }		


    
 
    
    
}
