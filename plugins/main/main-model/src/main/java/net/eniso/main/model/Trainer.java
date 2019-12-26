/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.model;

import java.util.Date;
import java.util.List;
import net.vpc.upa.config.Entity;
import net.vpc.upa.config.Formula;
import net.vpc.upa.config.Id;

/**
  * @author sofiene
 */

@Entity
public class Trainer extends User{

    @Override
    public String toString() {
        return "Trainer{" + "diciplines=" + diciplines + ", programes=" + programes +  ", classes=" + classes + ", charge=" + charge + '}';
    }
    
    

    public List<Dicipline> getDiciplines() {
        return diciplines;
    }

    public void setDiciplines(List<Dicipline> diciplines) {
        this.diciplines = diciplines;
    }

    public List<Program> getProgrames() {
        return programes;
    }

    public void setProgrames(List<Program> programes) {
        this.programes = programes;
    }


    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    List<Dicipline> diciplines ;
    
    List<Program> programes ;
        
    List<Classe> classes ;
    
    Charge charge ;
    

}
