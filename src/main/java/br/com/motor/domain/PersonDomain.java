package br.com.motor.domain;

import br.com.motor.domain.entiities.Person;

public interface PersonDomain {
    Person getPerson(Long personId);

}
