package com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.repository;

import com.mehmett._05_HibernateRelations.ManyToMany.BiDirectional.entity.Group;


public class GroupRepository extends RepositoryManager<Group, Long> {
	
	public GroupRepository() {
		super(Group.class);
	}
}