package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Administrativo extends Usuario{

  private String area;
  private String expPrevia;

}
