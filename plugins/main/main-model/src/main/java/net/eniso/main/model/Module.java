/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.model;

import java.util.List;
import net.vpc.upa.config.Entity;
import net.vpc.upa.config.Id;
import net.vpc.upa.config.Sequence;

/**
 *
 * @author sofiene
 */

@Entity
public class Module {

    @Override
    public String toString() {
        return "Module{" + "id=" + id + ", nom_module=" + nom_module + ", list_diDiciplines=" + list_diDiciplines + '}';
    }
    
    @Id @Sequence
    int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_module() {
        return nom_module;
    }

    public void setNom_module(String nom_module) {
        this.nom_module = nom_module;
    }

    public List<Dicipline> getList_diDiciplines() {
        return list_diDiciplines;
    }

    public void setList_diDiciplines(List<Dicipline> list_diDiciplines) {
        this.list_diDiciplines = list_diDiciplines;
    }
    
    String nom_module ;
    
    List<Dicipline> list_diDiciplines ;
     
}
