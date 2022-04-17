package com.oguzhan.Ornek.service;


import com.oguzhan.Ornek.repository.MusteriRepository;
import com.oguzhan.Ornek.repository.entity.Musteri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusteriService {

    @Autowired
    MusteriRepository repository;

    public void save(Musteri item){
        repository.save(item);
    }
    public void update(Musteri item){
        repository.save(item);
    }
    public void delete(long id){
        repository.deleteById(id);
    }
    public List<Musteri> findall(){
        return repository.findAll();
    }

}
