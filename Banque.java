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
public class Banque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        /** l'affichage pour un compte epragne **/
        Propritaire Test1 = new Propritaire("Nabil","N909");
        CompteEpragne ce=new CompteEpragne(Test1,0.2f);
        ce.depot(500);
        
        
        System.out.println(Test1);
        System.out.println(ce.calculInterets()+" DH");
         
        System.out.println("##################################");
        
        /** l'affichage pour un compte courant **/
        Propritaire Test2 = new Propritaire("Test2","N2909");
        CompteCourant ca=new CompteCourant(Test2,200);
        System.out.println(Test2);
        System.out.println(ca.getMontant()+" DH");
    }
    
    
}
