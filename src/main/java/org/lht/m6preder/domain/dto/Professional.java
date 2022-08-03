package org.lht.m6preder.domain.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class Professional extends User {

  private String degree;
  private Date entryDate;
}
