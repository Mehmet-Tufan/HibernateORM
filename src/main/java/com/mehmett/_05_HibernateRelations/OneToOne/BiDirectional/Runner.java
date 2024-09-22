package com.mehmett._05_HibernateRelations.OneToOne.BiDirectional;

import com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.entity.Car;
import com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.entity.Personel;
import com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.repository.CarRepository;
import com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.repository.PersonelRepository;

public class Runner {
	public static void main(String[] args) {
		
		CarRepository carRepository = new CarRepository();
		PersonelRepository personelRepository = new PersonelRepository();
		
		Personel personel1 = Personel.builder().name("Mehmet").build();
		Car car1 = Car.builder().model("BMW").personel(personel1).build();
		personel1.setCar(car1);
		
		carRepository.save(car1);
//		carRepository.deleteById(1L);
		
		carRepository.findAll().forEach(System.out::println);
		System.out.println("--------------");
		personelRepository.findAll().forEach(System.out::println);
		
		
	}
}