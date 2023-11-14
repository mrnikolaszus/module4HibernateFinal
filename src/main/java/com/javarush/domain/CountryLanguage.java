package com.javarush.domain;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(schema = "world", name = "country_language")
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;

    @Column(name = "is_official", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isOfficial;

    private BigDecimal percentage;


    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }
}