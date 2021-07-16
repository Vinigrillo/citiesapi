package com.github.vinigrillo.countries.repositories;

import com.github.vinigrillo.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
