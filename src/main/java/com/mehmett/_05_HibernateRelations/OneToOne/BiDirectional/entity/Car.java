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
@Table(name = "tblcar")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String model;
	@OneToOne(mappedBy = "car",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	Personel personel;
	
	
	@Override
	public String toString() {
		return "Car{" + "id=" + getId() +
				", model='" + getModel() + '\'' +
				", personel.id=" + getPersonel().getId() +
				", personel.name=" + getPersonel().getName() +
				'}';
	}
}