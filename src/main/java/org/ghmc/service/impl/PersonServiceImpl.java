package org.ghmc.service.impl;
import javax.enterprise.context.ApplicationScoped;

import org.ghmc.model.Person;
import org.ghmc.service.PersonService;

@ApplicationScoped
public class PersonServiceImpl implements PersonService {

    @Override
    public Person processRules(Person p ) {
        
        
        return p;
    }
    
}
