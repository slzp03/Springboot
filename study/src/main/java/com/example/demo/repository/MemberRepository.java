package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long>{
	@Query("select m from Member m where id = :id and password = :password")
	Member findMember(String id, String password);
	
	

}
