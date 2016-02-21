/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plugtree.examples.model;

/**
 *
 * @author salaboy
 */
public class RankedPerson {
    private Person person;
    private boolean approved;


    public RankedPerson(Person person) {
        this.person = person;
    }

    public RankedPerson(Person person, boolean approved) {
        this.person = person;
        this.approved = approved;
    }
    
    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
}
