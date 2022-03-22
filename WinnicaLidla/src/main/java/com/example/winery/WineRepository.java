package com.example.winery;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Table;
import java.util.Optional;
@Table(name="wine", schema = "user")
public interface WineRepository extends JpaRepository<Wine, Integer> {


    @Override
    Optional<Wine> findById(Integer integer);

    Optional<Wine> findByCountry(String country);


}