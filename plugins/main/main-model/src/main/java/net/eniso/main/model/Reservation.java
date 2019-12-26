/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.model;

import java.sql.Time;
import java.util.Date;
import net.vpc.upa.config.Entity;
import net.vpc.upa.config.Id;
import net.vpc.upa.config.Sequence;

/**
 *
 * @author sofiene
 */
@Entity
public class Reservation {

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", program=" + program + ", dicipline=" + dicipline + ", classe=" + classe + ", location=" + location + ", institution=" + institution + ", salle=" + salle + ", trainer=" + trainer + ", date_from=" + date_from + ", date_to=" + date_to + ", time_from=" + time_from + ", time_to=" + time_to + '}';
    }

  
    
        
    @Id @Sequence
    int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Dicipline getDicipline() {
        return dicipline;
    }

    public void setDicipline(Dicipline dicipline) {
        this.dicipline = dicipline;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }


    
    Program program ;
    
    Dicipline dicipline ;
    
    Classe classe ;
    
    Location location ;
    
    Institution institution ;
    
    Salle salle ;
    
    Trainer trainer ;

    public Date getDate_from() {
        return date_from;
    }

    public void setDate_from(Date date_from) {
        this.date_from = date_from;
    }

    public Date getDate_to() {
        return date_to;
    }

    public void setDate_to(Date date_to) {
        this.date_to = date_to;
    }

    public Time getTime_from() {
        return time_from;
    }

    public void setTime_from(Time time_from) {
        this.time_from = time_from;
    }

    public Time getTime_to() {
        return time_to;
    }

    public void setTime_to(Time time_to) {
        this.time_to = time_to;
    }
    
    Date date_from ;
    
    Date date_to ;
    
    Time time_from ;
    
    Time time_to ;

    
}
