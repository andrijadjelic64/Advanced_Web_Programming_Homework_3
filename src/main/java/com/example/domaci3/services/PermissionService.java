package com.example.domaci3.services;

import com.example.domaci3.model.User;

import java.util.List;
import java.util.Optional;

public class PermissionService implements IService<User,Integer>{

    @Override
    public <S extends User> S save(S var1) {
        return null;
    }

    @Override
    public Optional<User> findById(Integer var1) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(Integer var1) {

    }
}
