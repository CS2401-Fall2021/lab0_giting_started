public class UnformattedCode {

    public static void main(String[] args) {
        String[]x={"A","C","F","D","A","A","B"};doSomething(x);
    }
    public static int doSomething(String[] x){
        int count= x.length;
        int counts =0;
        for(int indexOfAValueInTheIntegerArrayNamedX =0;indexOfAValueInTheIntegerArrayNamedX<x.length;indexOfAValueInTheIntegerArrayNamedX++ ){
        if(x[indexOfAValueInTheIntegerArrayNamedX].equals("A")){counts=count+4;}
        if(x[indexOfAValueInTheIntegerArrayNamedX].equals("B")){
            counts=count+3;
             }
        if(
                x[indexOfAValueInTheIntegerArrayNamedX].equals("C")
        )
                {
            counts=count+2;
             }
            if(x[indexOfAValueInTheIntegerArrayNamedX].equals("D")){
                counts=count+1;
            }
            }
        return counts/count;
            }

}
