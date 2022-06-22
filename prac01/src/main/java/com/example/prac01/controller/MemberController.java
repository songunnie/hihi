package com.example.prac01.controller;

import com.example.prac01.domain.Member;
import com.example.prac01.dto.MemberRequestDto;
import com.example.prac01.repository.MemberRepository;
import com.example.prac01.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("/read/{id}")
    public List<Member> getMember() {
        return memberRepository.findAll();
    }

    @PostMapping("/create")
    public Member createMember(@RequestBody MemberRequestDto requestDto) {
        Member member = new Member(requestDto);
        return memberRepository.save(member);
    }

    @PutMapping("/update/{id}")
    public Long updateMember(@PathVariable Long id, @RequestBody MemberRequestDto requestDto) {
        return memberService.update(id, requestDto);
    }

    @DeleteMapping("/delete/{id}")
    public Long deleteMember(@PathVariable Long id) {
        memberRepository.deleteById(id);
        return id;
    }

//    @GetMapping("/recommend/{id}")

}
