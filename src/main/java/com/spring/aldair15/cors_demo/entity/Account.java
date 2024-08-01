package com.spring.aldair15.cors_demo.entity;

import com.spring.aldair15.cors_demo.dao.AccountDAOImpl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ACCOUNT")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account extends AccountDAOImpl {
    @Id
    @Column(name = "ID")
    long id;

    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "LAST_NAME")
    String lastName;
}
