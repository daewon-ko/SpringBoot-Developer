package me.daewonko.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void test() {
        memberRepository.save(new Member(1L, "A"));

        Optional<Member> member = memberRepository.findById(1L);
        List<Member> allMemmbers = memberRepository.findAll();

        memberRepository.deleteById(1L);

    }
}
