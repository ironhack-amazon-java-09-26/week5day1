package com.ironhack.hellospring.controller;

import com.ironhack.hellospring.model.Musician;
import com.ironhack.hellospring.service.MusicianService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("nationality/{nationality}")
    List<Musician> getByNationality(@PathVariable String nationality){
        return musicianService.getByNationality(nationality);
    }

    @GetMapping("/filters")
    public List<Musician> getByFiltered(@RequestParam String name, @RequestParam(required = false//, defaultValue = "unknown"
    ) String nationality){
        return musicianService.getMusicianFiltered(name, nationality);
    }
}
