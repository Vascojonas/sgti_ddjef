package com.ddjef.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@SuppressWarnings("serial")
@Entity
public class Buse extends AbstractEntity<Long> {
    
	@NotBlank(message = "O campo matricula é obrigatorio")
	@Size(min=3, max=50, message = "O matricula deve ter entre {min} e {max} caracteres")
	@Column(nullable=false, length=15)
	private String numberPlate;
	
	@NotBlank(message = "O campo modelo é obrigatorio")
	@Column(nullable=false, columnDefinition = "enum('standard', 'articulado', 'medio', 'classico')")
	private String model;
	
	@NotBlank(message = "O campo tipo é obrigatorio")
	@Column(nullable=false, columnDefinition = "enum('normal', 'executivo', '1 classe', '2 classe', '3 classe')")
	private String type;
	
    @Min( value = 15, message = "O tipo deve ter um minimo de {value}  caracteres")
	@Column()
	private int seats;
	@NotBlank(message = "O campo fabricante é obrigatorio")
	@Column(nullable=false, length = 200)
	private String manufacturer;
	
	@NotBlank(message = "O campo marca é obrigatorio")
    @Column(nullable=false, length = 200)
    private String brand;
    
    @Column(columnDefinition = "text")
    private String description;



	public Buse() {
	}
	public Buse(
			String numberPlate, String model, String type, int seats, String manufacturer, String brand,
			String description) {
		this.numberPlate = numberPlate;
		this.model = model;
		this.type = type;
		this.seats = seats;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.description = description;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
