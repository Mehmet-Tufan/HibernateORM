package com.mehmett._05_HibernateRelations.OneToMany.UniDirectional.OneSide.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tbluser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String username;
	@OneToMany (fetch = FetchType.EAGER)
			@JoinColumn(name = "userid")
	List<Post> posts;
	
	@Override
	public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\''
				+ ", posts=" +getPostData(posts)  + '}';
	}
	
public String getPostData(List<Post> posts){
		StringBuilder sb = new StringBuilder();
	for (Post post : posts) {
		sb.append("\n");
		sb.append("title: "+post.getTitle());
		sb.append("\n");
		sb.append("content: "+post.getContent());
		sb.append("\n");
	}
	return sb.toString();
}
}