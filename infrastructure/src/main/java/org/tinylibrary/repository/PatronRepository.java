package org.tinylibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tinylibrary.entity.Patron;

@Repository
public interface PatronRepository extends JpaRepository<Patron, Long> {
}
