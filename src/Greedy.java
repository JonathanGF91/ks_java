
import java.util.ArrayList;
import java.util.List;

public class Greedy {
    
    public Greedy(){
    
    }
    
    public static List<Integer> result(Bag bag){
        List<Integer> result = new ArrayList<>();
        int i = 0;
            while (bag.getCurrentWeight() < bag.getMaxWeight() || i < 1){
                if(bag.getCurrentWeight() + bag.getWeightOfIndex(i) <= bag.getMaxWeight()){
                
                }else{
                
                }
            }
            
        return result;
    }
}
