package com.springapiproject.store.repositories;

import com.springapiproject.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}