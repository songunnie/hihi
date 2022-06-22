package com.example.prac01.service;

import com.example.prac01.domain.Member;
import com.example.prac01.dto.MemberRequestDto;
import com.example.prac01.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

//    public MemberService(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    } @RequiredArgsConstructor 랑 같은거여서 주석처리함.

    @Transactional
    public Long update(Long id, MemberRequestDto requestDto) {
        Member member1 = memberRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 없습니다.")
        );
        member1.update(requestDto);
        return member1.getId();
    }
}
