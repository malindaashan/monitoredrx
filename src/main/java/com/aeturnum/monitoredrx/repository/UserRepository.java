package com.aeturnum.monitoredrx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeturnum.monitoredrx.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
