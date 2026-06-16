enum Season {

    SPRING, 
    SUMMER, 
    AUTUMN, 
    WINTER

}

public class enumPractice1{
    public static void main(String[] args) {

        Season season = Season.SPRING;
        Season season2 = Season.WINTER;
        System.out.println(season);
        System.out.println(season2);

        System.out.println("----------");

        for(Season s : Season.values()){
            System.out.println(s);
        }
    }
}
