package com.enviro.assessment.grad001.kamohelolebjane.repository;

import com.enviro.assessment.grad001.kamohelolebjane.model.Enviro;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EnviroRep extends JpaRepository<Enviro, Long> {
	@Query("SELECT i.wasteCategory FROM Enviro i")
    List<String> findAllCategories();
	@Query("SELECT i.DisposalGuidlines FROM Enviro i")
    List<String> findDisposalGuidlines();
	@Query("SELECT i.RecyclingTips FROM Enviro i")
    List<String> findRecyclingTips();
	@Modifying
	@Transactional
	@Query("UPDATE Enviro e SET e.RecyclingTips = :RecyclingTips WHERE e.id = :id")
    int updateRecyclingTips(Long id, String RecyclingTips);}

