package com.example.firstSpringBootApp.controller;

import com.example.firstSpringBootApp.model.Fish;
import com.example.firstSpringBootApp.service.FishService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/fishes")
@AllArgsConstructor
public class FishController {

    private FishService service;

    @GetMapping
    public List<Fish> findAllFish(){
        return service.findAllFish();
    }

    @PostMapping("/save_fish")
    public String addFish(@RequestBody Fish fish){
        service.addFish(fish);
        return "fine";
    }

    @GetMapping("/{name}")
    public Fish getByName(@PathVariable String name){
        return service.getByName(name);
    }

    @PutMapping("/update_fish")
    public Fish updateFish(@RequestBody Fish fish){
        return service.updateFish(fish);
    }

    @DeleteMapping("/delete_fish/{name}")
    public void deleteFish(@PathVariable String name){
        service.delete(name);
    }
}
