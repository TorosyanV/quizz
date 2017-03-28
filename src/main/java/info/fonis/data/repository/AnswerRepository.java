package info.fonis.data.repository;

import info.fonis.data.entity.AnswerEntity;
import info.fonis.data.entity.ResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface AnswerRepository extends JpaRepository<AnswerEntity, Long> {
}
