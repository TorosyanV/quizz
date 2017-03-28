package info.fonis.data.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vazgent on 3/28/2017.
 */
@Entity
@Table(name = "question")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "orderNumber")
    private int orderNumber;

    @Column(name="text")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizzId", nullable = false)
    private QuizzEntity quizz;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "question")
    private List<AnswerEntity> answers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public QuizzEntity getQuizz() {
        return quizz;
    }

    public void setQuizz(QuizzEntity quizz) {
        this.quizz = quizz;
    }

    public List<AnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerEntity> answers) {
        this.answers = answers;
    }
}
