package com.oguzhan.Ornek.controller;

import com.oguzhan.Ornek.repository.entity.Musteri;
import com.oguzhan.Ornek.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/musteri")
public class MusteriController {

    @Autowired
    MusteriService musteriService;

    @PostMapping("/save")
    public void save(String ad, String soyad){
        Musteri musteri = new Musteri(ad,soyad);
        musteriService.save(musteri);
    }

    @GetMapping("/findall")
    public List<Musteri> findall(){
        return musteriService.findall();
    }
}
