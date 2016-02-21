/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plugtree.examples.model;

/**
 *
 * @author salaboy
 */
public class Person {
    private String name;
    private int age;
    private int ranking;
    
    public Person(int age) {
        this.age = age;
    }
    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
