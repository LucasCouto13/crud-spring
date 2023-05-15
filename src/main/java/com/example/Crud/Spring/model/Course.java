package com.example.Crud.Spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "cursos")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String SEQ = "cursos_seq";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = SEQ, sequenceName = SEQ, allocationSize = 1)
    @JsonProperty("_id")
    private Long id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "category", length = 20, nullable = false)
    private String category;

}
