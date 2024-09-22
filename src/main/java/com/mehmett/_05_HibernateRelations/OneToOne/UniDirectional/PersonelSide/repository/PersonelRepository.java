package com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.repository;

import com.mehmett._05_HibernateRelations.OneToOne.UniDirectional.PersonelSide.entity.Personel;

public class PersonelRepository extends RepositoryManager<Personel, Long> {
	public PersonelRepository() {
		super(Personel.class);
	}
}