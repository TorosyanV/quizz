package info.fonis.service.dto;

/**
 * Created by vazgent on 3/28/2017.
 */
public class ResultCreateDto {

    private String tilte;

    private String content;

    private int weight;

    private long quizzId;

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

    public long getQuizzId() {
        return quizzId;
    }

    public void setQuizzId(long quizzId) {
        this.quizzId = quizzId;
    }
}
