package org.lht.m6preder.persistence.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "idCliente")
public class Cliente extends Usuario {

  private int rut;
  private String nombres;
  private String apellidos;
  private String telefono;
  private String afp;

  @Enumerated(EnumType.STRING)
  private SistemaSalud sistemaSalud;

  private String direccion;
  private String comuna;
  private int edad;

}