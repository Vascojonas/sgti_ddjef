package com.ddjef.service;

import com.ddjef.entity.Buse;
import com.ddjef.repository.BuseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuseService {

  @Autowired
  private BuseRepository buseRepository;



  public List<Buse> findAll(){
    return buseRepository.findAll();
  }
  public Buse save(Buse buse){
    return buseRepository.save(buse);
  }

  public Buse update(Buse buse){
    return buseRepository.save(buse);
  }

  public void delete(Buse buse){
    buseRepository.delete(buse);
  }

  public Buse findById(Long id){
    return buseRepository.findById(id).orElse(null);
  }
}
