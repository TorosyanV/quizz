package info.fonis.service;

import info.fonis.data.entity.ResultEntity;
import info.fonis.data.repository.QuizzRepository;
import info.fonis.data.repository.ResultRepository;
import info.fonis.service.dto.ResultCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vazgent on 3/28/2017.
 */
@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private QuizzRepository quizzRepository;

    @Autowired
    private ResultRepository resultRepository;

    @Override
    public Long createResult(ResultCreateDto resultCreateDto) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setWeight(resultCreateDto.getWeight());
        resultEntity.setContent(resultCreateDto.getContent());
        resultEntity.setTilte(resultCreateDto.getTilte());
        resultEntity.setQuizz(quizzRepository.getOne(resultCreateDto.getQuizzId()));
        ResultEntity savedResult = resultRepository.save(resultEntity);
        return savedResult.getId();
    }
}
