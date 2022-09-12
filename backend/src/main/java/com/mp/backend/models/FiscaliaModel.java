package com.mp.backend.models;

import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Fiscalia")
public class FiscaliaModel {
    @Getter @Setter @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "Id")
    private Long id;

    @Getter @Setter
    @Column(name = "Name", length = 100)
    private String name;

    @Getter @Setter
    @Column(name = "Address")
    private String address;

    @Getter @Setter
    @Column(name = "Phone", length = 13)
    private String phone;

    @Getter @Setter
    @Column(name = "Latitude")
    private String latitude;

    @Getter @Setter
    @Column(name = "Longitude")
    private String longitude;

    @Getter @Setter
    @Column(name = "CreatedAt", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Getter @Setter
    @Column(name = "UpdatedAt", nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;
}