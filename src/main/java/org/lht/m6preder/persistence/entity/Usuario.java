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
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idUsuario;


  private String nombre;
  private Date fechaNacimiento;
  private Integer run;
  private Timestamp ultimaActualizacion;

}

