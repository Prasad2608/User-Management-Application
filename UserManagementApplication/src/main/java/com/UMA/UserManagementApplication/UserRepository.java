package com.UMA.UserManagementApplication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
