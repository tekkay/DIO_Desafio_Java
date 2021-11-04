package com.github.tekkay.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.tekkay.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
