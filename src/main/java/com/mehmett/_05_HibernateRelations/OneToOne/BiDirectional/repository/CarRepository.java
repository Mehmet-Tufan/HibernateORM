package com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.repository;

import com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.entity.Car;

public class CarRepository extends RepositoryManager<Car, Long> {
	
	public CarRepository() {
		super(Car.class);
	}
}