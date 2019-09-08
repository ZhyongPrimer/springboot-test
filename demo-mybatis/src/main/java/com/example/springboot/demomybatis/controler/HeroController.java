package com.example.springboot.demomybatis.controler;

import com.example.springboot.demomybatis.domain.Hero;
import com.example.springboot.demomybatis.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hero")
public class HeroController {
    
    @Autowired
    private HeroService heroService;
    
    @RequestMapping(value = "/name")
    public Hero findOneHero(String name) {
        return heroService.findByName(name);
    }
    
    @RequestMapping(value = "/insert")
    public Hero insertHero(Hero hero) {
        return heroService.insertHero(hero);
    }
    
    @RequestMapping(value = "/delete")
    public void deleteHero(String name) {
        heroService.deleteHero(name);
    }
    
    @RequestMapping(value = "/getAll")
    public List<Hero> getAllHero() {
        return heroService.getAllHero();
    }
}
