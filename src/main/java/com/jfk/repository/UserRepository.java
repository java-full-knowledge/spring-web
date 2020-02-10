package com.jfk.repository;


import com.jfk.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author William Arustamyan
 */


public interface UserRepository extends CrudRepository<User, Integer> {
}
