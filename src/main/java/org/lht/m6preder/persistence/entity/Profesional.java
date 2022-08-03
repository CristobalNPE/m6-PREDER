package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Profesional{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProfesional;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "id_usuario", insertable = true, updatable = false)
  private Usuario usuario;

  private String titulo;
  private Date fechaIngreso;

}
