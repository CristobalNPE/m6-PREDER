package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Profesional extends Usuario{

  private String titulo;
  private Date fechaIngreso;

}
