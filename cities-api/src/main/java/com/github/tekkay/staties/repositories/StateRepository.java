package com.github.tekkay.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.tekkay.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
