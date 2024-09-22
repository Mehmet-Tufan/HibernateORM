package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide;

import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.entity.Car;
import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.entity.Personel;
import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.repository.CarRepository;
import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.repository.PersonelRepository;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		
		CarRepository carRepository = new CarRepository();
		PersonelRepository personelRepository = new PersonelRepository();
		
		Car car = Car.builder().model("Bmw").build();
		Personel personel = Personel.builder().name("Mehmet").car(car).build();
		
//		carRepository.save(car);
//		personelRepository.save(personel);
//		personelRepository.findAll().forEach(System.out::println);
//		carRepository.findAll().forEach(System.out::println);
	
	}
}