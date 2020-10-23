package com.talk2amareswaran.projects.springboot2authserver.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talk2amareswaran.projects.springboot2authserver.entity.UserORA;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserORA, Long> {

	UserORA findByUsername(String username);

}


