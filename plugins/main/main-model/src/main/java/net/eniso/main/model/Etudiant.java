/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.model;

import net.vpc.upa.config.Entity;


/**
 *
 * @author sofiene
 */
@Entity
public class Etudiant extends User{

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
    

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }
    
    


  
    Charge charge ;
 
    
    public Institution institution ;

    public Classe classe ;
    
    public Program program ;

    @Override
    public String toString() {
        return "Etudiant{" + "charge=" + charge + ", institution=" + institution + ", classe=" + classe + ", program=" + program + '}';
    }

  
    
   
    

     
}
