package info.fonis.service;

import info.fonis.data.entity.QuizzEntity;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface QuizzService {
    Long createQuizz(String name);
    QuizzEntity getById(long id);
}
