package com.springsecurity.oauth2withgoogle.repository;

import com.springsecurity.oauth2withgoogle.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
