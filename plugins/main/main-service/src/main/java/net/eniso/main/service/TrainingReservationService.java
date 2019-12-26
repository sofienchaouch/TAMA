/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eniso.main.service;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import net.eniso.main.model.Program;
import net.eniso.main.model.Trainer;
import net.eniso.main.model.Classe;
import net.eniso.main.model.Etudiant;
import net.eniso.main.model.Institution;
import net.eniso.main.model.Location;
import net.eniso.main.model.Reservation;
import net.vpc.upa.PersistenceUnit;
import net.vpc.upa.UPA;
import org.springframework.stereotype.Component;

/**
 *
 * @author sofiene
 */
@Component
public class TrainingReservationService {

    private Program program;
    private Dicipline dicipline;
    private Classe classe;
    private Location location;
    private Institution institution;
    private Salle salle;
    private Trainer trainer;
    private Date date_from;
    private Date date_to;
    private Time time_from;
    private Time time_to;
    private Reservation reservation;

    //create reservation 
    public Reservation CreateReservation() {
        reservation = new Reservation();

        reservation.setProgram(program);
        reservation.setDicipline(dicipline);
        reservation.setClasse(classe);
        reservation.setLocation(location);
        reservation.setInstitution(institution);
        reservation.setSalle(salle);
        reservation.setTrainer(trainer);
        reservation.setDate(date_from);
        reservation.setDate(date_to);
        reservation.setTime(time_from);
        reservation.setTime(time_to);

        return reservation;
    }

    //submit reservation 
    public void addReservation() {

        UPA.getPersistenceUnit().persist(reservation);
    }

    //return programms available
    public List<Program> ReturnPrograms() {
        List<Program> programs = UPA.getPersistenceUnit().createQuery("Select i from Program i").getResultList();

        return programs;
    }

    //select  a  programms 
    public Program SelectProgram(int i) {
        List<Program> programs = UPA.getPersistenceUnit().createQuery("Select i from Program i").getResultList();

        program = programs.get(i);

        return programs.get(i);
    }

    //return diciiplines 
    public List<Dicipline> ReturnDisciplines() {
        List<Dicipline> diciplines = UPA.getPersistenceUnit().createQuery("Select i from Dicipline  i").getResultList();

        return diciplines;
    }

    //select  a  Dicipline 
    public Dicipline SelectDicipline(int i) {
        List<Dicipline> diciplines = UPA.getPersistenceUnit().createQuery("Select i from Dicipline  i").getResultList();

        dicipline = diciplines.get(i);
        return diciplines.get(i);
    }

    //return alist of class
    public List<Classe> ReturnClasses() {
        List<Classe> Classes = UPA.getPersistenceUnit().createQuery("Select i from Classe  i").getResultList();

        return Classes;
    }

    //select  a  Classe 
    public Classe SelectClasse(int i) {
        List<Classe> classes = UPA.getPersistenceUnit().createQuery("Select i from Classe  i").getResultList();

        classe = classes.get(i);

        return classes.get(i);
    }

    //return list of Etudiants from class 
    public List<Etudiant> ReturnEtudiantsByClass() {

        return classe.getList_étudiant();
    }

    //return list of Etudiants
    public List<Etudiant> ReturnEtudiants() {
        List<Etudiant> etudiants = UPA.getPersistenceUnit().createQuery("Select i from Etudiant  i").getResultList();

        return etudiants;
    }

    //select  an  Etudiant 
    public Etudiant SelectEtudiant(int i) {
        List<Etudiant> etudiants = UPA.getPersistenceUnit().createQuery("Select i from Etudiant  i").getResultList();

        return etudiants.get(i);
    }

    // return list of locations
    public List<Location> ReturnLocations() {
        List<Location> locations = UPA.getPersistenceUnit().createQuery("Select i from Location  i").getResultList();

        return locations;
    }

    //select  a  location 
    public Location SelectLocation(int i) {
        List<Location> locations = UPA.getPersistenceUnit().createQuery("Select i from Location  i").getResultList();

        location = locations.get(i);
        return locations.get(i);
    }

    //return list of institutions
    public List<Institution> ReturnInstitutions() {
        List<Institution> institutions = UPA.getPersistenceUnit().createQuery("Select i from Institution  i").getResultList();

        return institutions;
    }

    //select  an Institution 
    public Institution SelectInstitution(int i) {
        List<Institution> institutions = UPA.getPersistenceUnit().createQuery("Select i from Institution  i").getResultList();

        institution = institutions.get(i);
        return institutions.get(i);
    }

    // return list of salles
    public List<Salle> ReturnSalles() {
        List<Salle> salles = UPA.getPersistenceUnit().createQuery("Select i from Salle  i").getResultList();

        return salles;
    }

    //select  a  Salle 
    public Salle SelectSalle(int i) {
        List<Salle> salles = UPA.getPersistenceUnit().createQuery("Select i from Salle  i").getResultList();

        salle = salles.get(i);

        return salles.get(i);
    }

    //returns list of trainers
    public List<Trainer> ReturnTrainers() {
        List<Trainer> trainers = UPA.getPersistenceUnit().createQuery("Select i from Trainer  i").getResultList();

        return trainers;
    }

    //select  a  Trainer 
    public Trainer SelectTrainer(int i) {
        List<Trainer> trainers = UPA.getPersistenceUnit().createQuery("Select i from Trainer  i").getResultList();

        trainer = trainers.get(i);

        return trainers.get(i);
    }

    public void selectDate(Date from, Date to) {
        date_from = from ;
        date_to = to ;

    }

    public void selectTime(Time from, Time to) {
        time_from = from ;
        time_to = to ;

    }

    /*
    
        public void addTrainer(Trainer t) {
        PersistenceUnit em = UPA.getPersistenceUnit();
        Trainer a = em.findById(Trainer.class, t.getId());
        if (t == null) {
            em.persist(t);
        } else {
            em.merge(t);
        }
    }
     */
}
