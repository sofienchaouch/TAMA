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
class Charge {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Period> getList_charges() {
        return list_charges;
    }

    public void setList_charges(List<Period> list_charges) {
        this.list_charges = list_charges;
    }

    @Override
    public String toString() {
        return "Charge{" + "id=" + id + ", list_charges=" + list_charges + '}';
    }
    
    @Id @Sequence
    int id ;
    
    List<Period> list_charges ;
}
