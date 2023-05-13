# Duplication Example
public class Duplication  {

    public void example(){
        String[] data1 = {"Duplicate", "Example"};

        for(int i=0;i<data1.length;i++){
            String s = "Super : "+data1[i];
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Duplication test = new Duplication();
        test.example();
    }

}
