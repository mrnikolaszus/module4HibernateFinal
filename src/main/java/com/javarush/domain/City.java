package com.javarush.domain;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (exclude = "country")
@ToString (exclude = "country")
@Entity
@Table(schema = "world", name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;



}
