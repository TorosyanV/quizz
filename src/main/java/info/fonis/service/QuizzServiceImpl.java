package info.fonis.service;

import info.fonis.data.entity.QuizzEntity;
import info.fonis.data.repository.QuizzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by vazgent on 3/28/2017.
 */
@Service
public class QuizzServiceImpl implements QuizzService {

    @Autowired
    private QuizzRepository quizzRepository;

    @Override
    @Transactional
    public Long createQuizz(String name) {
        return quizzRepository.save(new QuizzEntity(name)).getId();
    }

    @Override
    public QuizzEntity getById(long id) {
        return quizzRepository.getOne(id);
    }
}
