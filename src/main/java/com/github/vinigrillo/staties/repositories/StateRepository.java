package com.github.vinigrillo.staties.repositories;

import com.github.vinigrillo.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
