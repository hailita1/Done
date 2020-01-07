package com.codegym.repository;

import com.codegym.model.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserSpringDataRepository extends PagingAndSortingRepository<Users, Long> {
}
