package com.tekup.AgenceImmobilier.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_Status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "description")
	private String description;

	@Column(name = "status_code")
	private String statusCode;

	@Column(name = "color")
	private String color;
	
	@Column(name = "background_color")
	private String backgroundColor;

	@OneToMany(mappedBy = "status")
	private List<BienImmobilier> bienImmobiliers;
	
	@OneToMany(mappedBy = "status")
	private List<Reclamation> reclamations;

	public Status() {
		super();
	}

	public Status(long id, String description, String statusCode, String color, String backgroundColor) {
		super();
		this.id = id;
		this.description = description;
		this.statusCode = statusCode;
		this.color = color;
		this.backgroundColor = backgroundColor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	
}
