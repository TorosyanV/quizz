package info.fonis.service;

import info.fonis.service.dto.AnswerCreateDto;
import info.fonis.service.dto.AnswerDto;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface AnswerService {
    AnswerDto getById(long id);
    Long createAnswer(AnswerCreateDto answerCreateDto);
}
