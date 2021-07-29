package com.example.md4_thbai12_1.repo;

import com.example.md4_thbai12_1.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepo extends CrudRepository<Smartphone, Long> {
}
