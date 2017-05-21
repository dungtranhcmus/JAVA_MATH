
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class math {
    
    public float sum(float a, float b){
        return a +b ;
    }
    public float minus(float a, float b){
        return a - b ;
    }
    //giải phương trình bật 2
    public float solve_2rd_equation(float a, float b, float c){
        //vô số nghiệm
        if(a == 0 && b == 0 && c ==0){
            return 0;
        }
        //vô nghiệm
        if(a == 0 && b ==0){
            return Float.NaN;
        }
        return 0;
    }
    //giải phương trình bật 1
    public float solve_1st_equation(float a, float b){
        if(a == 0 & b ==0)
            return 0;
        if(a == 0){
            return Float.NaN;
        }
        
        return -b/a;
    }
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(mathTest.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println("Failure ==> " + failure.toString());
        }
    }
    
    
}
