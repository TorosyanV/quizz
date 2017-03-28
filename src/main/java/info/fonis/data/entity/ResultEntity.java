package info.fonis.data.entity;

import javax.persistence.*;

/**
 * Created by vazgent on 3/28/2017.
 */
@Entity
@Table(name = "result")
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", nullable = false)
    private String tilte;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "weiht", nullable = false)
    private int weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quizzId", nullable = false)
    private QuizzEntity quizz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public QuizzEntity getQuizz() {
        return quizz;
    }

    public void setQuizz(QuizzEntity quizz) {
        this.quizz = quizz;
    }
}
