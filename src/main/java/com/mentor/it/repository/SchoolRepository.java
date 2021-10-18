package com.mentor.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentor.it.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
