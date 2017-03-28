package info.fonis.service;

import info.fonis.data.entity.AnswerEntity;
import info.fonis.data.repository.AnswerRepository;
import info.fonis.data.repository.QuestionRepository;
import info.fonis.service.dto.AnswerCreateDto;
import info.fonis.service.dto.AnswerDto;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vazgent on 3/28/2017.
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public AnswerDto getById(long id) {
        AnswerEntity answer = answerRepository.getOne(id);
        return mapper.map(answer, AnswerDto.class);
    }

    @Override
    public Long createAnswer(AnswerCreateDto answerCreateDto) {
        AnswerEntity answerEntity = new AnswerEntity();
        answerEntity.setText(answerCreateDto.getText());
        answerEntity.setOrderNumber(answerCreateDto.getOrderNumber());
        answerEntity.setQuestion(questionRepository.getOne(answerCreateDto.getQuestionId()));
        answerEntity.setWeight(answerCreateDto.getWeight());
        AnswerEntity savedAnswer = answerRepository.save(answerEntity);
        return savedAnswer.getId();

    }
}
