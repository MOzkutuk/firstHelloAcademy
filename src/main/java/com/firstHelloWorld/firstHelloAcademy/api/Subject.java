package com.firstHelloWorld.firstHelloAcademy.api;

import javax.persistence.*;

@Entity(name = "subject")
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Subject() {
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

}
