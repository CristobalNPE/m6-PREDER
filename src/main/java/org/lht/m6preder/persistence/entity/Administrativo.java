package org.lht.m6preder.persistence.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Administrativo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idAdministrativo;

  @OneToOne
  @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
  private Usuario usuario;

  private String area;
  private String expPrevia;

}
