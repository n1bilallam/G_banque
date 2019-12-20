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
public class CompteEpragne extends CompteBancaire {
    private float t;
    
    public CompteEpragne(Propritaire proprietaire,float taux) {
        super(proprietaire);
        t=taux;
    }

    public float getTauxInterets() {
        return t;
    }
    
    public double calculInterets() {
        solde=solde+solde*t;
        return solde;
    }
    
}
