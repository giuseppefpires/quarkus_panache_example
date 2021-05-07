package org.sample;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Person extends PanacheEntity {

    //at compile time this will be change to private
    public String name;

    public String surname;

    public int age;
}
