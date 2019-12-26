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
public class Location {

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", name=" + name + ", list_instInstitutions=" + list_instInstitutions + '}';
    }
    
    
    @Id @Sequence
    int id ;

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

    public List<Institution> getList_instInstitutions() {
        return list_instInstitutions;
    }

    public void setList_instInstitutions(List<Institution> list_instInstitutions) {
        this.list_instInstitutions = list_instInstitutions;
    }
    
    public String name ;
    
    List<Institution> list_instInstitutions ;
}
