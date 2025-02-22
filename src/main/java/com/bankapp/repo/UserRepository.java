package com.bankapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.Entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}
