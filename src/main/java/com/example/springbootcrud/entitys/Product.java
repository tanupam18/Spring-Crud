package com.example.springbootcrud.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_table")
public class Product { // Model with validations
	@Id
	@GeneratedValue
	private int id;

	@NotBlank(message = "Product Name is mandatory")
	private String name;

	@NotNull(message = "Quantity is required field")
	@Range(min = 1, max = Integer.MAX_VALUE, message = "This field is required.It should be valid number.")
	private Integer quantity;

	@DecimalMax("10000000.00")
	@DecimalMin("0.0")
	private Double price;

}
