package de.lubowiecki.springstarter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FahrzeugRepository extends JpaRepository<Fahrzeug, Integer> {
}