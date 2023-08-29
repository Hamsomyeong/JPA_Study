package com.study.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter//없는게 좋음.
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;

    protected Member(){}//proxy 기술 쓸 때 필요해서 private로 막으면 안됨.

    public Member(String username){
        this.username = username;
    }
}
