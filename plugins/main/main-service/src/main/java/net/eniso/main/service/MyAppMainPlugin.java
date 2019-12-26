package net.eniso.main.service;

import net.vpc.app.vainruling.core.service.CorePlugin;
import net.vpc.app.vainruling.VrPlugin;
import net.vpc.app.vainruling.VrInstall;
import net.vpc.app.vainruling.VrStart;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.logging.Logger;
import net.eniso.main.model.Trainer;

/**
 * Plugin (Module) Main for application
 *
 * @author sofiene
 */
@VrPlugin
public class MyAppMainPlugin {

    private static final Logger log = Logger.getLogger(MyAppMainPlugin.class.getName());

    @Autowired
    private CorePlugin core;
    @Autowired
    private TrainingReservationService trainingReservationService;


    /**
     * module installation process. Called on application startup when the
     * plugin is first bundled (as dependency) or when a new version is bundled
     */
    @VrInstall
    private void onInstall() {
        //configure CMS properties
        core.setAppProperty("System.App.Description", null, "my-app");
        core.setAppProperty("System.App.Keywords", null, "my-app");
        core.setAppProperty("System.App.Title.Major.Main", null, "my-app");
        core.setAppProperty("System.App.Title.Major.Secondary", null, "app");
        core.setAppProperty("System.App.Title.Minor.Main", null, "my-app");
        core.setAppProperty("System.App.Title.Minor.Secondary", null, "app");
        core.findOrCreateAppDepartment("D", "D", "Department");
        core.findOrCreateArticleDisposition("Services", "Services", "Services");
    }

    /**
     * module initialization process. Called on each application startup (after
     * @Install phase methods if any)
     */
    @VrStart
    private void onStart() {

    }

    public void CreateReservation() {
        trainingReservationService.CreateReservation();
    }

    public void ReturnClasses() {
        trainingReservationService.ReturnClasses();
    }

    public void ReturnDisciplines() {
        trainingReservationService.ReturnDisciplines();
    }

    public void ReturnEtudiants() {
        trainingReservationService.ReturnEtudiants();
    }

    public void ReturnEtudiantsByClass() {
        trainingReservationService.ReturnEtudiantsByClass();
    }

    public void ReturnInstitutions() {
        trainingReservationService.ReturnInstitutions();
    }

    public void ReturnLocations() {
        trainingReservationService.ReturnLocations();
    }

    public void ReturnPrograms() {
        trainingReservationService.ReturnPrograms();
    }

    public void ReturnSalles() {
        trainingReservationService.ReturnSalles();
    }

    public void ReturnTrainers() {
        trainingReservationService.ReturnTrainers();
    }

    public void SelectClasse(int i) {
        trainingReservationService.SelectClasse(i);
    }

    public void SelectEtudiant(int i) {
        trainingReservationService.SelectEtudiant(i);
    }

    public void SelectInstitution(int i) {
        trainingReservationService.SelectInstitution(i);
    }

    public void SelectLocation(int i) {
        trainingReservationService.SelectLocation(i);
    }

    public void SelectTrainer(int i) {
        trainingReservationService.SelectTrainer(i);
    }
    
    public void SelectSalle(int i) {
        trainingReservationService.SelectSalle(int i);
    }
    
    
    public void ReturnSalles() {
        trainingReservationService.ReturnSalles();
    }

    public void addReservation() {
        trainingReservationService.addReservation();
    }

    public void selectDate(Date from , Date to) {
        trainingReservationService.selectDate(from, to);
    }

    public void selectTime(Time from , Time to) {
        trainingReservationService.selectTime(from, to);
       
    }



}
