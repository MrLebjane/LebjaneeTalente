package com.enviro.assessment.grad001.kamohelolebjane.model;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CategorizationLookup {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	/*
	 * This category acts as a foreign key for each category.
	 * This is so that I can have more information on how each category can be identified.
	 *Many items can fall under 1 waste category so the ItemIdentification can store all those type of 
	 *waste items information and reference them under 1 waste category 
	 */
	@ManyToOne
	private Enviro category;
	// ItemIdentification Stores information of a type of waste item that falls under this category
	private String ItemIdentification;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public CategorizationLookup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategorizationLookup(Enviro category, String itemIdentification) {
		super();
		this.category = category;
		ItemIdentification = itemIdentification;
	}
	public Enviro getCategory() {
		return category;
	}
	public void setCategory(Enviro category) {
		this.category = category;
	}
	public String getItemIdentification() {
		return ItemIdentification;
	}
	public void setItemIdentification(String itemIdentification) {
		ItemIdentification = itemIdentification;
	}
	
	
}
