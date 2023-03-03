package com.api.restaws.controllers;

import com.api.restaws.dto.PersonDto;
import com.api.restaws.services.PersonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService service;
    @GetMapping
    public List<PersonDto> getAll() {
        return service.findAll();
    }

    @PostMapping(
            consumes = "application/json",
            produces = "application/json"
    )
    public PersonDto create(@RequestBody @Valid PersonDto personDto) {
        return service.create(personDto);
    }
}
