package info.fonis.service;

import info.fonis.service.dto.QuestionCreateDto;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface QuestionService {
    Long createQuestion(QuestionCreateDto questionCreateDto);
}
