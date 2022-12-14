package com.example.common.repository;


import com.example.common.entity.RoleUser;
import com.example.common.entity.StatusSeller;
import com.example.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String username);

    Page<User> findUserByRole(RoleUser roleUser, Pageable pageable);

    Page<User> findUserByRoleAndStatus(RoleUser roleUser, StatusSeller status, Pageable pageable);

    Optional<User> findByEmailAndVerifyToken(String email, String token);

    List<User> findUserByRole(RoleUser roleUser);


}
