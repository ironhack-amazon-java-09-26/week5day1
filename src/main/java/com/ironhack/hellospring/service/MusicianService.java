package com.ironhack.hellospring.service;

import com.ironhack.hellospring.model.Musician;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MusicianService {

    private int latestIndex = 1;
    private List<Musician> musicians = new ArrayList<>(
            List.of(
                    new Musician(latestIndex++, "John Coltrane", "American"),
                    new Musician(latestIndex++, "Miles Davis", "American"),
                    new Musician(latestIndex++, "Duke Ellington", "American"),
                    new Musician(latestIndex++, "Louis Armstrong", "American"),
                    new Musician(latestIndex++, "Chet Baker", "American"),
                    new Musician(latestIndex++, "Washington Duke Ellington", "American"),
                    new Musician(latestIndex++, "Tom Jobim", "Brazilian"),
                    new Musician(latestIndex++, "João Gilberto", "Brazilian"),
                    new Musician(latestIndex++, "Caetano Veloso", "Brazilian"),
                    new Musician(latestIndex++, "Caetano Veloso", "Italian")
            )
    );

    public List<Musician> getAll() {
        return musicians;
    }

    public Musician getById(int id) {
        for (Musician musician : musicians){
            if (musician.getId() == id){
                return musician;
            }
        }
        return null;
    }

    public List<Musician> getByNationality(String nationality) {
        List<Musician> foundMusicians = new ArrayList<>();
        for (Musician musician : musicians) {
            if (musician.getNationality().equalsIgnoreCase(nationality)){
                foundMusicians.add(musician);
            }
        }
        return foundMusicians;
    }

    public List<Musician> getByName(String name) {
        List<Musician> foundMusicians = new ArrayList<>();
        for (Musician musician : musicians) {
            if (musician.getName().equalsIgnoreCase(name)){
                foundMusicians.add(musician);
            }
        }
        return foundMusicians;
    }

    public List<Musician> getMusicianFiltered(String name, String nationality){
        if (Objects.nonNull(nationality)){
            List<Musician> foundMusicians = new ArrayList<>();
            for (Musician musician : musicians) {
                if (musician.getName().equalsIgnoreCase(name) && musician.getNationality().equalsIgnoreCase(nationality)){
                    foundMusicians.add(musician);
                }
            }
            return foundMusicians;
        } else {
            return getByName(name);
        }

        
    }

}
