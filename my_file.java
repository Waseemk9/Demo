# Duplication Example
public class ConditionalBreakPoint  {

    public void breakOnConditionOnly(){
        String[] data1 = {"Duplicate", "Example"};

        for(int i=0;i<data1.length;i++){
            String s = "Super : "+data1[i];
            System.out.println(s);
        }  
    }
    public static void main(String[] args) {
        ConditionalBreakPoint test = new ConditionalBreakPoint();
        test.breakOnConditionOnly();
    }

}
