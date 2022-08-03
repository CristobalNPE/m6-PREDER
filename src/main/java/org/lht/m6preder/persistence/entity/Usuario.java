package org.lht.m6preder.persistence.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idUsuario;


  private String nombre;
  private Date fechaNacimiento;
  private Integer run;

  @CreationTimestamp
  private Timestamp ultimaActualizacion;

}

