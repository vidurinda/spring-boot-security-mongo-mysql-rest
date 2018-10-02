package com.icloud.micro.dao;

import com.icloud.micro.model.Bank;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BankRepository extends PagingAndSortingRepository<Bank, Integer> {
}
