package com.example.pp3_1_2.repository;

import com.example.pp3_1_2.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
