package org.lht.m6preder.domain.dto;

import lombok.Data;
import org.lht.m6preder.persistence.entity.SistemaSalud;

@Data
public class Customer extends User {

  private int str;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String pfa;

  private SistemaSalud healthSystem;

  private String address;
  private String district;
  private int age;

}
