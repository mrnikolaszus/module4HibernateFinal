package com.javarush.util;


import com.javarush.domain.City;
import com.javarush.domain.Country;
import com.javarush.domain.CountryLanguage;
import lombok.experimental.UtilityClass;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@UtilityClass
public class HibernateUtil {
    public static SessionFactory buildSessionFactory(){
        Configuration configuration = buildConfiguration();
        configuration.configure();
        return configuration.buildSessionFactory();
    }

    public static Configuration buildConfiguration() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(City.class);
        configuration.addAnnotatedClass(Country.class);
        configuration.addAnnotatedClass(CountryLanguage.class);
        return configuration;
    }
}
