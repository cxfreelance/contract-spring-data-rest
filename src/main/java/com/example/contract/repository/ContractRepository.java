package com.example.contract.repository;

import com.example.contract.entity.Contract;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ContractRepository extends PagingAndSortingRepository<Contract, Integer> {

    @Query("select c from Contract c where (:id is null or c.id = :id) and (:status is null or :status = '' or c.status = :status)")
    List<Contract> example(Integer id, String status);

}
