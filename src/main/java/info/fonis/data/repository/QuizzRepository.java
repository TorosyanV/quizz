package info.fonis.data.repository;

import info.fonis.data.entity.QuizzEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface QuizzRepository extends JpaRepository<QuizzEntity, Long> {
}
