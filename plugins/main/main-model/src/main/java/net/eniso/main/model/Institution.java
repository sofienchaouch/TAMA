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
public class Institution {

    @Override
    public String toString() {
        return "Institution{" + "id=" + id + ", nom=" + nom + ", salles=" + salles + ", list_etudiant=" + list_etudiant + ", location=" + location + '}';
    }
    
    @Id  @Sequence
    public int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public List<Etudiant> getList_etudiant() {
        return list_etudiant;
    }

    public void setList_etudiant(List<Etudiant> list_etudiant) {
        this.list_etudiant = list_etudiant;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public String nom ;
    
    public List<Salle> salles ;
    
    public List<Etudiant> list_etudiant ;
     
    public Location location ;
}
