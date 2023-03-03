package com.api.restaws.services;

import com.api.restaws.dto.PersonDto;
import com.api.restaws.entities.Person;
import com.api.restaws.repositories.PersonRepository;
import com.api.restaws.utils.DtoUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repository;

    public List<PersonDto> findAll() {
        return DtoUtils.copyProperties(repository.findAll(), new PersonDto());
    }

    public PersonDto create(PersonDto personDto) {
        Person person = DtoUtils.copyProperties(personDto, new Person());
        Person personRepositorySave = repository.save(person);
        return DtoUtils.copyProperties(personRepositorySave, new PersonDto());
    }
}
