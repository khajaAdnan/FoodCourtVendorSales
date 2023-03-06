import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sales {

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

    public HashMap cal (List<FoodCourt> foodCourtList){
        HashMap<String, List<FoodCourt>> map = new HashMap<String , List<FoodCourt>>();

        for (FoodCourt foodCourt : foodCourtList){
            if (!map.containsKey(foodCourt.getFoodCourt())){
                map.put(foodCourt.getFoodCourt() , new ArrayList<>());
                map.get(foodCourt.getFoodCourt()).add(foodCourt);
            }
            else {
                double total = 0.0;
                boolean isPresent = false;
                for (FoodCourt foodCourt1 : map.get(foodCourt.getFoodCourt())){
                    if (foodCourt.getVendorName().equals(foodCourt1.getVendorName())){
                        total += foodCourt.getPrice() + foodCourt1.getPrice();
                        foodCourt1.setPrice(total);
                        isPresent = true;
                    }
                }
                if (!isPresent) {
                    map.get(foodCourt.getFoodCourt()).add(foodCourt);
                }
            }
        }
        return map;
    }
}
