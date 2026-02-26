import java.util.List;

public class AreaCalculator {
    double total=0;
    public void totalArea(List<Shape>shapes){
        for(int i=0;i<shapes.size();i++){
           total+=shapes.get(i).area();
    }
        System.out.println(String.format("%.2f",total));
}}
