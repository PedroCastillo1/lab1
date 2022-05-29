package org.austral.ing.lab1.model;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Medic {
    @Id
    private Long matricula;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "APELLIDO")
    private String lastName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ESPECIALIDAD")
    private String medicalSpecialty;

    @Column(name = "CONTACTO")
    private int contact;
    public Medic() {

    }

    public Medic(Long matricula, String name, String lastName, String password, String medicalSpecialty, int contact) {
        this.matricula = matricula;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.medicalSpecialty = medicalSpecialty;
        this.contact = contact;
    }

    public static Medic create(Long matricula, String name, String lastname, String password, String speciality, int contact) {
        return new Medic(matricula,name,lastname,password,speciality,contact);
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public int getContact() {
        return contact;
    }

}