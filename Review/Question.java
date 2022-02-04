package Review;

public class Question {
    private String qs;
    private String ans;
    private String name;

    public Question(String name, String qs, String ans) {
        this.name = name;
        this.qs = qs;
        this.ans = ans;
    }

    public String getQs() {
        return qs;
    }

    public String getAns(){
        return ans;
    }

    @Override
    public String toString() {
        return  name;
    }
}
