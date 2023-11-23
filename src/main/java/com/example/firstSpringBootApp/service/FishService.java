package com.example.firstSpringBootApp.service;

import com.example.firstSpringBootApp.model.Fish;
import java.util.List;


public interface FishService {
    List<Fish> findAllFish();
    Fish getByName(String name);
    Fish addFish(Fish fish);
    Fish updateFish(Fish fish);
    void delete(String name);
}
