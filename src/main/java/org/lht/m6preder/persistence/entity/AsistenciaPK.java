package org.lht.m6preder.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@Embeddable
public class AsistenciaPK  implements Serializable {

  private Long idAsistente;
  private Long idCapacitacion;

}
