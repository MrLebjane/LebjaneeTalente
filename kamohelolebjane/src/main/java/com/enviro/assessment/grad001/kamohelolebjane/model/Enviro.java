package com.enviro.assessment.grad001.kamohelolebjane.model;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Enviro {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String wasteCategory;
    private String DisposalGuidlines;
    private String RecyclingTips;

    
    public Enviro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enviro(String wasteCategory, String disposalGuidlines, String recyclingTips) {
		super();
		this.wasteCategory = wasteCategory;
		DisposalGuidlines = disposalGuidlines;
		RecyclingTips = recyclingTips;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWasteCategory() {
		return wasteCategory;
	}

	public void setWasteCategory(String wasteCategory) {
		this.wasteCategory = wasteCategory;
	}

	public String getDisposalGuidlines() {
		return DisposalGuidlines;
	}

	public void setDisposalGuidlines(String disposalGuidlines) {
		DisposalGuidlines = disposalGuidlines;
	}

	public String getRecyclingTips() {
		return RecyclingTips;
	}

	public void setRecyclingTips(String recyclingTips) {
		RecyclingTips = recyclingTips;
	}
	

//    private String author;
}
