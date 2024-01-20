package com.reza.library_membership.service;

import java.util.List;

import com.reza.library_membership.entity.Member;

public interface MemberService {

	public List<Member> listOfMembers(Member member);
	
	public Member findMemberById(Integer memberId);
	
	public Member saveMember(Member member);
	
	public void deleteMember(Integer memberId);
	
	public Member updateMember(Integer memberId, Member member);
}
