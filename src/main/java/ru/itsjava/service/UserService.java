package ru.itsjava.service;

import ru.itsjava.domain.User;

public interface UserService {
    void create(User user);

    void printAllUsers();
}
