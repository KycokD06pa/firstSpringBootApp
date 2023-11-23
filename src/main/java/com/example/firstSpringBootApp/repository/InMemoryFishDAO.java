package com.example.firstSpringBootApp.repository;

import com.example.firstSpringBootApp.model.Fish;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryFishDAO {

    private final List<Fish> FISH = new ArrayList<>();

    public List<Fish> findAllFish() {
        return FISH;
    }
    public Fish getByName(String name) {
        return FISH.stream().filter(element -> element.getName()
                .equals(name)).findFirst().orElse(null);
    }
    public Fish addFish(Fish fish) {
        FISH.add(fish);
        return fish;
    }
    public Fish updateFish(Fish fish) {
        var fishIndex = IntStream.range(0, FISH.size())
                .filter(index -> FISH.get(index).getName().equals(fish.getName())).findFirst()
                .orElse(-1);
        if(fishIndex > -1){
            FISH.set(fishIndex, fish);
            return fish;
        }
        return null;
    }
    public void delete(String name) {
        var fish = getByName(name);
        if(fish != null){
            FISH.remove(fish);
        }
    }
}
