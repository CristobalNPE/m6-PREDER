package org.lht.m6preder.persistence.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente extends Usuario {

  @Column(name = "rut")
  private int rut;
  @Column(name = "nombres")
  private String nombres;
  @Column(name = "apellidos")
  private String apellidos;
  @Column(name = "telefono")
  private String telefono;
  @Column(name = "afp")
  private String afp;

  @Enumerated(EnumType.STRING)
  @Column(unique = true, name = "sistema_salud")
  private SistemaSalud sistemaSalud;

  @Column(name = "direccion")
  private String direccion;

  @Column(name = "comuna")
  private String comuna;

  @Column(name = "edad")
  private int edad;

  @Column(name = "updated_at")
  private Timestamp updatedAt;


  public Cliente(String nombre, Date fechaNacimiento, Integer run, Timestamp updatedAt, int rut, String nombres, String apellidos, String telefono, String afp, SistemaSalud sistemaSalud, String direccion, String comuna, int edad, Timestamp updatedAt1) {
    super(nombre, fechaNacimiento, run, updatedAt);
    this.rut = rut;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.afp = afp;
    this.sistemaSalud = sistemaSalud;
    this.direccion = direccion;
    this.comuna = comuna;
    this.edad = edad;
    this.updatedAt = updatedAt1;
  }
}
