package info.fonis.data.repository;

import info.fonis.data.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {
}
