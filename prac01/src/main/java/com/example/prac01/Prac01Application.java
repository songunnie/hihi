package com.example.prac01;

import com.example.prac01.domain.Member;
import com.example.prac01.dto.MemberRequestDto;
import com.example.prac01.repository.MemberRepository;
import com.example.prac01.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Prac01Application {

    public static void main(String[] args) {
        SpringApplication.run(Prac01Application.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(MemberRepository memberRepository, MemberService memberService) {
//        return (args) -> {
//            memberRepository.save(new Member("song@gmail.com", "임성언", 30, 0));

//            Member memb = new Member("kar@naver.com", "이메인", 32, 1);
//            memberService.update(1L, memb);

//            List<Member> memberList =  memberRepository.findAll();
//            for(int i=0; i<memberList.size(); i++) {
//                Member member = memberList.get(i);
//                System.out.println(member.getId());
//                System.out.println(member.getEmail());
//                System.out.println(member.getName());
//                System.out.println(member.getAge());
//                System.out.println(member.getGender());
//            }
//
//            MemberRequestDto requestDto = new MemberRequestDto("kar@naver.com", "임성언", 31, 1);
//            memberService.update(1L, requestDto);
//            memberList = memberRepository.findAll();
//            for(int i=0; i<memberList.size(); i++) {
//                Member member = memberList.get(i);
//                System.out.println(member.getId());
//                System.out.println(member.getEmail());
//                System.out.println(member.getName());
//                System.out.println(member.getAge());
//                System.out.println(member.getGender());
//            }

//            memberRepository.deleteAll();
//        };
//    }
}
