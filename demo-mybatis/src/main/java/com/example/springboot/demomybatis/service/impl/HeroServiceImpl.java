package com.example.springboot.demomybatis.service.impl;

import com.example.springboot.demomybatis.dao.HeroDao;
import com.example.springboot.demomybatis.domain.Hero;
import com.example.springboot.demomybatis.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService{
    
    @Autowired
    private HeroDao heroDao;
    
    @Override
    public Hero findByName(String name) {
        return heroDao.findByName(name);
    }
    
    @Transactional
    @Override
    public Hero insertHero(Hero hero) {
         heroDao.insertHero(hero);
         return hero;
    }
    
    @Override
    public void deleteHero(String name) {
        heroDao.deleteHero(name);
    }
    
    @Override
    public List<Hero> getAllHero() {
        return heroDao.getAllHero();
    }
    
    
}
