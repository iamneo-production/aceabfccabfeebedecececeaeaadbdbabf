package com.examly.springapp.repository;

import com.examly.springapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByEmailAndPassword(String email, String password);
    Optional<UserModel> findByEmailAndPasswordAndUserRole(String email, String password, String userRole);

    Optional<UserModel> findByEmail(String email);



}
