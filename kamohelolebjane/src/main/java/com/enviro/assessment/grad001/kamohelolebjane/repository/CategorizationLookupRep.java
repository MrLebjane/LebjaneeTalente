package com.enviro.assessment.grad001.kamohelolebjane.repository;
import com.enviro.assessment.grad001.kamohelolebjane.model.CategorizationLookup;
import com.enviro.assessment.grad001.kamohelolebjane.model.Enviro;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorizationLookupRep extends JpaRepository<CategorizationLookup, Long>{
	//This query outputs different types of waste categories and information of the types of waste items that belong in that waste category
	@Query("SELECT e.category.wasteCategory, e.ItemIdentification FROM CategorizationLookup e")
    List<String> AllCategoriesandIdentificationInfo();
	
	//Deletes a certain ItemIdentification information of a certain category by ID.
	@Modifying
    @Transactional
    @Query("DELETE FROM CategorizationLookup e WHERE e.id = :id")
    int deleteItemIdentificationInfoById(@Param("id") Long id);
}
