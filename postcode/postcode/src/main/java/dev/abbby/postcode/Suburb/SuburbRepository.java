package dev.abbby.postcode.Suburb;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SuburbRepository extends JpaRepository<Suburb, Long> {
    Optional<Suburb> findByName(String name);
    Optional<Suburb> findByPostcode(String postcode);
}