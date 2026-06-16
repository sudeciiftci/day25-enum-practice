enum Difficulty{
    EASY(10), MEDIUM(20), HARD(30);

    private int point;

    Difficulty(int point){
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    

}

public class enumPractice3 {
    public static void main(String[] args) {
        Difficulty difficulty = Difficulty.HARD;

        System.out.println(difficulty.getPoint());
    }
}
