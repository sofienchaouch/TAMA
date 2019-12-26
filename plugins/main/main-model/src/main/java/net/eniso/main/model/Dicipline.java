/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.model;

import java.util.List;
import net.vpc.upa.config.Id;
import net.vpc.upa.config.Sequence;

/**
 *
 * @author sofiene
 */
class Dicipline {
    
    @Id @Sequence
    int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_dicipline() {
        return nom_dicipline;
    }

    public void setNom_dicipline(String nom_dicipline) {
        this.nom_dicipline = nom_dicipline;
    }

    public List<Trainer> getList_trainers() {
        return list_trainers;
    }

    public void setList_trainers(List<Trainer> list_trainers) {
        this.list_trainers = list_trainers;
    }
    
    String nom_dicipline;
    
    public List<Trainer> list_trainers ;

    @Override
    public String toString() {
        return "Dicipline{" + "id=" + id + ", nom_dicipline=" + nom_dicipline + ", list_trainers=" + list_trainers + '}';
    }
    
   
    
}
