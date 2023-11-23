package com.example.firstSpringBootApp.repository;

import com.example.firstSpringBootApp.model.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {

    void deleteByName(String name);
    Fish getByName(String name);
}
