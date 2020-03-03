package com.contactmanagercode.contactmanager.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contact")
public class Contact {

  // fields
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @NotBlank
  @Size(min=3,max=30)
  private String firstName;

  @NotBlank
  @Size(min=3,max=30)
  private String lastName;

  @NotBlank
  private String gender;

  @NotBlank
  private String phone;

  // default constructor
  public Contact() {
    super();
  }

  // parameterized constructor
  public Contact(String firstName, String lastName, String gender, String phone) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
