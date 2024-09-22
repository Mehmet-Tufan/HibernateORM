package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide;

import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.entity.Car;
import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.entity.Personel;
import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.repository.CarRepository;
import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.repository.PersonelRepository;

public class Runner {
	public static void main(String[] args) {
		
		CarRepository carRepository = new CarRepository();
		PersonelRepository personelRepository = new PersonelRepository();
		
		
		Personel personel = Personel.builder().name("Mehmet").build();
		Car car = Car.builder().model("Bmw").personel(personel).build();
		
		personelRepository.save(personel);
		carRepository.save(car);
		personelRepository.findAll().forEach(System.out::println);
		carRepository.findAll().forEach(System.out::println);
	
	}
}