package com.springapiproject.store.repositories;

import com.springapiproject.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
