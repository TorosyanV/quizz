package info.fonis.service.dto;

/**
 * Created by vazgent on 3/28/2017.
 */
public class QuestionCreateDto {
    private String text;
    private int orderNumber;
    private long quizzId;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public long getQuizzId() {
        return quizzId;
    }

    public void setQuizzId(long quizzId) {
        this.quizzId = quizzId;
    }
}
