package com.ironhack.hellospring.controller;

import com.ironhack.hellospring.model.Musician;
import com.ironhack.hellospring.service.MusicianService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/musicians")
public class MusicianController {

    public MusicianController(MusicianService musicianService) {
        this.musicianService = musicianService;
    }

    private final MusicianService musicianService;


    @GetMapping()
    public List<Musician> getAll(){
        return musicianService.getAll();
    }

    @GetMapping("/{id}")
    public Musician getById(@PathVariable int id){
        return musicianService.getById(id);
    }
}
