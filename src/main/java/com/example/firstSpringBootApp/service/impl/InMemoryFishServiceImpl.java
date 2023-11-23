package com.example.firstSpringBootApp.service.impl;

import com.example.firstSpringBootApp.model.Fish;
import com.example.firstSpringBootApp.repository.InMemoryFishDAO;
import com.example.firstSpringBootApp.service.FishService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryFishServiceImpl implements FishService {

    private final InMemoryFishDAO repository;
    @Override
    public List<Fish> findAllFish() {
        return repository.findAllFish();
    }

    @Override
    public Fish getByName(String name) {
        return repository.getByName(name);
    }

    @Override
    public Fish addFish(Fish fish) {
        return repository.addFish(fish);
    }

    @Override
    public Fish updateFish(Fish fish) {
        return repository.updateFish(fish);
    }

    @Override
    public void delete(String name) {
        repository.delete(name);
    }
}
