package com.example.springboot.demomybatis.service;

import com.example.springboot.demomybatis.domain.Hero;

import java.util.List;


public interface HeroService{
    Hero findByName(String name);
    
    Hero insertHero(Hero hero);
    
    void deleteHero(String name);
    
    List<Hero> getAllHero();
}
