package com.example.finance;

import org.springframework.data.repository.Repository;

public interface UserAppRepository extends Repository<UserApp, Long> {
    UserApp save(UserApp user);

	UserApp findByName(String name);
}