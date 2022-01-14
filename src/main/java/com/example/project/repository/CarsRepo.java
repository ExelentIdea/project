package com.example.project.repository;

import com.example.project.domain.Machines;
import org.springframework.data.repository.CrudRepository;

public interface CarsRepo extends CrudRepository<Machines, Integer> {
}
