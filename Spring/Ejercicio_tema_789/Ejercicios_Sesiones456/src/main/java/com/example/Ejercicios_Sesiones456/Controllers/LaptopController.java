package com.example.Ejercicios_Sesiones456.Controllers;

import com.example.Ejercicios_Sesiones456.Entities.Laptop;
import com.example.Ejercicios_Sesiones456.Repositories.LaptopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    //Find all
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }


    //Find By Id
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
        if (optionalLaptop.isPresent())
            return ResponseEntity.ok(optionalLaptop.get());
        else
            return ResponseEntity.notFound().build();
    }

    //Create
    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        if (laptop.getId()!=null) {
            log.warn("Trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok(result);
    }


    //Udate
    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if (laptop.getId()==null){
            log.warn("Trying to update a non existent laptop");
            return ResponseEntity.badRequest().build();
        }
        if (!laptopRepository.existsById(laptop.getId())){
            log.warn("Trying to update a non existent laptop");
        }

        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok().build();

    }

    //Delete
    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete (@PathVariable Long id ){
        if (!laptopRepository.existsById(id)){
            log.warn("Trying to delete a non existent laptop");
            return ResponseEntity.notFound().build();
        }

        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    //Delete all
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        log.info("REST request to delete all");
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
