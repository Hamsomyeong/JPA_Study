package com.study.datajpa.repository;

import com.study.datajpa.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository {

    @PersistenceContext//spring container가 알아서 처리
    private EntityManager em;

    public Member save(Member member){
        em.persist(member);
        return  member;
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
