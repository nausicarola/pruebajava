package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "app_user_phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number; // Número de teléfono
    private String citycode; // Código de ciudad
    private String countrycode; // Código de país

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Clave foránea
    private User user; // Relación con el usuario
}