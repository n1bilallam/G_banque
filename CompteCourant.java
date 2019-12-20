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

    public class CompteCourant extends CompteBancaire {
    private double montant;
    
    public CompteCourant(Propritaire proprietaire, double decouvert) {
        super(proprietaire);
        montant=decouvert;
    }

    public double getMontant() {
        return montant;
    }
    


}

