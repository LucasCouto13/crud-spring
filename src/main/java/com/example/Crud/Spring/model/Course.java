package com.example.Crud.Spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

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

    @Length(min = 3, max = 100)
    @NotBlank
    @NotNull
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Length(max = 20)
    @NotBlank
    @NotNull
    @Column(name = "category", length = 20, nullable = false)
    private String category;

}
