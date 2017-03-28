package info.fonis.service;

import info.fonis.data.entity.QuestionEntity;
import info.fonis.data.repository.QuestionRepository;
import info.fonis.data.repository.QuizzRepository;
import info.fonis.service.dto.QuestionCreateDto;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vazgent on 3/28/2017.
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private QuizzRepository quizzRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    @Transactional
    public Long createQuestion(QuestionCreateDto questionCreateDto){
        QuestionEntity questionEntity =new QuestionEntity();
        questionEntity.setOrderNumber(questionCreateDto.getOrderNumber());
        questionEntity.setText(questionCreateDto.getText());
        questionEntity.setQuizz(quizzRepository.getOne(questionCreateDto.getQuizzId()));
        return questionRepository.save(questionEntity).getId();
    }
}
