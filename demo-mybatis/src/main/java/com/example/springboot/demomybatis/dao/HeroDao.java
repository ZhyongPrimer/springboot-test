package com.example.springboot.demomybatis.dao;


import com.example.springboot.demomybatis.domain.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HeroDao {

    Hero findByName(@Param("name") String name);
    
    void insertHero(Hero hero);
    
    void deleteHero(String name);
    
    List<Hero> getAllHero();
}
