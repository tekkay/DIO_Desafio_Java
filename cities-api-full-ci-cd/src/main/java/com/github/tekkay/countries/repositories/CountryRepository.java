package com.github.tekkay.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.tekkay.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
