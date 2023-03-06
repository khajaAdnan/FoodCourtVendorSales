import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sales sales = new Sales();

        List<FoodCourt> foodCourtList = List.of(
                new FoodCourt("fc1" , "v1" , 2000),
                new FoodCourt("fc2" , "v2" , 2000),
                new FoodCourt("fc3" , "v1" , 2000),
                new FoodCourt("fc1" , "v3" , 2000),
                new FoodCourt("fc2" , "v3" , 2000),
                new FoodCourt("fc3" , "v2" , 2000),
                new FoodCourt("fc1" , "v3" , 2000),
                new FoodCourt("fc2" , "v2" , 2000),
                new FoodCourt("fc3" , "v1" , 2000)
        );

        System.out.println(sales.cal(foodCourtList));
    }
}