package com.example.finance;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface UserAppRepository extends Repository<UserApp, Long> {
    UserApp save(UserApp user);

	UserApp findByName(String name);
}