package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.repository;

import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.CarSide.entity.Personel;

public class PersonelRepository extends RepositoryManager<Personel, Long> {
	public PersonelRepository() {
		super(Personel.class);
	}
}