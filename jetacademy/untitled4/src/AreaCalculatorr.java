import java.util.ArrayList;
import java.util.List;

public class AreaCalculatorr {
    double totalArea(List<Shapee> list){
        double totalArea = 0;
        for(Shapee s:list){
            totalArea += s.area();
        }
        return totalArea ;
    }
}
