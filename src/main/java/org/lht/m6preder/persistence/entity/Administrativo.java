package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "idAdministrativo")
public class Administrativo extends Usuario{

  private String area;
  private String expPrevia;

}
