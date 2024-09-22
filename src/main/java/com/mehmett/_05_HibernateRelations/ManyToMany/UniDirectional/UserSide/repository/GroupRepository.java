package com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.repository;

import com.mehmett._05_HibernateRelations.ManyToMany.UniDirectional.UserSide.entity.Group;


public class GroupRepository extends RepositoryManager<Group, Long> {
	
	public GroupRepository() {
		super(Group.class);
	}
}