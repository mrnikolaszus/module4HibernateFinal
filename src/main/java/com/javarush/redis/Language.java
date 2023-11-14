package com.javarush.redis;

import lombok.*;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }
}