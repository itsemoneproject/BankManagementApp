package com.bankapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.Entities.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {}
