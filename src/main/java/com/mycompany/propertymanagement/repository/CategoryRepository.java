package com.mycompany.propertymanagement.repository;

import com.mycompany.propertymanagement.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
}
