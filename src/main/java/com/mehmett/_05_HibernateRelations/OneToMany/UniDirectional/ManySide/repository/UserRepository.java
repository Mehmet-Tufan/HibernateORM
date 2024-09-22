package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.repository;

import com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.ManySide.entity.User;


public class UserRepository extends RepositoryManager<User, Long> {
	public UserRepository() {
		super(User.class);
	}
}