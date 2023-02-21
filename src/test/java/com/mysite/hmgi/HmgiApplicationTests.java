package com.mysite.hmgi;

import java.util.Optional;

import com.mysite.hmgi.answer.AnswerService;
import com.mysite.hmgi.question.Question;
import com.mysite.hmgi.question.QuestionRepository;
import com.mysite.hmgi.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
//		Question q1 = new Question();
//		q1.setSubject("hmgi 무엇인가요?");
//		q1.setContent("hmgi 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);  // 첫번째 질문 저장
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);  // 두번째 질문 저장


		//findAll
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("hmgi 무엇인가요?", q.getSubject());

		//findById
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("hmgi 무엇인가요?", q.getSubject());
//		}

		//findBySubject -> QuestionRepository
//		Question q = this.questionRepository.findBySubject("hmgi 무엇인가요?");
//		assertEquals(1, q.getId());

		//findBySubjectAndContent
//		Question q = this.questionRepository.findBySubjectAndContent(
//				"hmgi 무엇인가요?", "hmgi 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());

		//findBySubjectLick
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());

		//data update
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);

	}
}
