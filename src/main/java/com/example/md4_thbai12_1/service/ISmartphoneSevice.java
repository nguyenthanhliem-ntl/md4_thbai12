package com.example.md4_thbai12_1.service;

import com.example.md4_thbai12_1.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneSevice {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
