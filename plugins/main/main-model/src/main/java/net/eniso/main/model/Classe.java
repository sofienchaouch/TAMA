/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.model;

import java.util.List;
import net.vpc.upa.config.Entity;

/**
 *
 * @author sofiene
 */

@Entity
public class Classe {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Etudiant> getList_étudiant() {
        return list_étudiant;
    }

    public void setList_étudiant(List<Etudiant> list_étudiant) {
        this.list_étudiant = list_étudiant;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public int id ;
    
    public String name;
    
    public List<Etudiant> list_étudiant ;
    
    public Program program ;
    
    public Trainer trainer;
            
    public Salle salle ;
    
    Institution institution;
    
    Location location ;

    @Override
    public String toString() {
        return "Classe{" + "id=" + id + ", name=" + name + ", list_\u00e9tudiant=" + list_étudiant + ", program=" + program + ", trainer=" + trainer + ", salle=" + salle + ", institution=" + institution + ", location=" + location + '}';
    }
    
    
}
