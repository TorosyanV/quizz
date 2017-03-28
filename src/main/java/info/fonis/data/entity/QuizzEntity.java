package info.fonis.data.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vazgent on 3/28/2017.
 */
@Entity
@Table(name = "quizz")
public class QuizzEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "quizz")
    private List<ResultEntity> result;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "quizz")
    private List<QuestionEntity> questions;

    public QuizzEntity(String name) {
        this.name= name;
    }

    public QuizzEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public List<QuestionEntity> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }
}
