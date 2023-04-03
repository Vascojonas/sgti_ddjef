package com.ddjef.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Client extends AbstractEntity<Long> {

  @NotBlank(message = "O campo documento é obrigatorio")
  @Size(
    min = 3,
    max = 50
  )
  @Column(
    nullable = false,
    name = "document_type",
    columnDefinition = "enum('BI', 'Carta de conducao', 'Passaporte')"
  )
  private String documentType;

  @NotBlank(message = "O campo numero do documento é obrigatorio")
  @Size(
    min = 5,
    max = 20,
    message = "O numero do documento deve ter entre {min} e {max} caracteres"
  )
  @Column(nullable = false, name = "document_number", length = 20)
  private String documentNumber;

  @OneToOne(fetch = FetchType.LAZY,cascade=CascadeType.REFRESH)
  @JoinColumn(name = "user_id", nullable = false)
  private User user;



  
public Client( String documentType,String documentNumber, User user) {
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.user = user;
}

public String getDocumentType() {
    return documentType;
}

public void setDocumentType(String documentType) {
    this.documentType = documentType;
}

public String getDocumentNumber() {
    return documentNumber;
}

public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
}

public User getUser() {
    return user;
}

public void setUser(User user) {
    this.user = user;
}


  
}
