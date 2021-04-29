package com.example.api.bug.repository;

import com.example.api.bug.domain.Bugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugsRepository extends JpaRepository<Bugs, Long> {
}
