package com.hospital.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

}
