package com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.repository;

import com.mehmett._05_HibernateRelations.OneToOne.BiDirectional.entity.Personel;

public class PersonelRepository extends RepositoryManager<Personel, Long> {
	public PersonelRepository() {
		super(Personel.class);
	}
}