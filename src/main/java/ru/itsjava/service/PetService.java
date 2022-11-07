package ru.itsjava.service;

import ru.itsjava.domain.Pet;

import java.util.Optional;

public interface PetService {
    Pet findById(long id);
}
