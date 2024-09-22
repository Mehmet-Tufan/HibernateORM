package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tblcar")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String model;
	
}