package com.example.firstSpringBootApp.service.impl;

import com.example.firstSpringBootApp.model.Fish;
import com.example.firstSpringBootApp.repository.FishRepository;
import com.example.firstSpringBootApp.service.FishService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class FishServiceImpl implements FishService {
    private final FishRepository repository;
    @Override
    public List<Fish> findAllFish() {
        return repository.findAll();
    }

    @Override
    public Fish getByName(String name) {
        return repository.getByName(name);
    }

    @Override
    public Fish addFish(Fish fish) {
        return repository.save(fish);
    }

    @Override
    public Fish updateFish(Fish fish) {
        return repository.save(fish);
    }

    @Override
    @Transactional
    public void delete(String name) {
        repository.deleteByName(name);
    }
}
