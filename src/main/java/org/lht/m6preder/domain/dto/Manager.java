package org.lht.m6preder.domain.dto;

import lombok.Data;

@Data
public class Manager {

  private Long managerId;
  private User user;

  private String section;
  private String priorExp;
}
