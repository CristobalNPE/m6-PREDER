package org.lht.m6preder.domain.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class User {

  private Long userId;

  private String name;
  private Date birthday;
  private Integer dni;
  private Timestamp updatedAt;
}
