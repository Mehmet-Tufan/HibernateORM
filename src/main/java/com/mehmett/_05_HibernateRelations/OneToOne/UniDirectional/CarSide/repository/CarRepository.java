package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.repository;

import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.entity.Car;

public class CarRepository extends RepositoryManager<Car, Long> {
	
	public CarRepository() {
		super(Car.class);
	}
}