package com.example.finance;

import org.springframework.data.repository.PagingAndSortingRepository;
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {}