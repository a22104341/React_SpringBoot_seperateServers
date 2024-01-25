package com.tfc.project.repository;

import com.tfc.project.entity.CTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CTOrepository extends JpaRepository<CTO, Long> {

}
