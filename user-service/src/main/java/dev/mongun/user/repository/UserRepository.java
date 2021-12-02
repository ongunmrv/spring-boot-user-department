package dev.mongun.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mongun.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long userId);

}
