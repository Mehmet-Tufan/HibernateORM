package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.repository;

import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.entity.Car;

public class CarRepository extends RepositoryManager<Car, Long> {
	
	public CarRepository() {
		super(Car.class);
	}
}