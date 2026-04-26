package com.educandoweb.course.records;

import com.educandoweb.course.entities.User;

public record UserDTO(Long id, String name, String email, String phone) {

    public UserDTO(User entity) {
        this(entity.getId(), entity.getName(), entity.getEmail(), entity.getPhone());
    }
}

