package com.example.overnightweb.repository;


import com.example.overnightweb.entity.RoleUser;
import com.example.overnightweb.entity.StatusSeller;
import com.example.overnightweb.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String username);

    Page<User> findUserByRole(RoleUser roleUser, Pageable pageable);

    Page<User> findUserByRoleAndStatus(RoleUser roleUser, StatusSeller status, Pageable pageable);

    Optional<User> findByEmailAndVerifyToken(String email, String token);



}
