package com.madsvyat.crud.repository;

import com.madsvyat.crud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
}
