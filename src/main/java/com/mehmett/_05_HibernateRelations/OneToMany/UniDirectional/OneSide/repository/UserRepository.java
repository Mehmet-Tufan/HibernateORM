package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.repository;

import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.entity.User;


public class UserRepository extends RepositoryManager<User, Long> {
	public UserRepository() {
		super(User.class);
	}
}