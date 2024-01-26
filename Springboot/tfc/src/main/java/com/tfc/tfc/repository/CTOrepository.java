package com.tfc.tfc.repository;

import com.tfc.tfc.domain.CTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CTOrepository extends JpaRepository<CTO, String> {
    Optional<CTO> findByUuid(String uuid);
}
