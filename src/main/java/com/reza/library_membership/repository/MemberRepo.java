package com.reza.library_membership.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reza.library_membership.entity.Member;

@Repository
public interface MemberRepo extends JpaRepository<Member, Integer>{

}
