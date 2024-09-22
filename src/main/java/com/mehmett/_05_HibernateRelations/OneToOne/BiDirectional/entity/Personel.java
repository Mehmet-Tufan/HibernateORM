package com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.entity;

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
@Table(name = "tblpersonel")
public class Personel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	@OneToOne
	@JoinColumn(name = "carid")
	Car car;
	
	
	@Override
	public String toString() {
		return "Personel{" +
				"id=" + getId() +
				", name='" + getName() + '\'' +
				", car.id=" + getCar().getId() +
				", car.model=" + getCar().getModel() +
				'}';
	}
}