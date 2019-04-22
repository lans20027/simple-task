
public class Test {
    static final int A[] = {1,2,3,4,5,6,7,8,9};
    static final int target = 100;

    static void checkSum(String signs){
        int sum = 0;
        String str="";
        signs = signs.replaceAll("0"," ");
        signs = signs.replaceAll("1","+");
        signs = signs.replaceAll("2","-");
        str += A[0];

        for(int i = 0; i < signs.length(); i++){
            str += String.valueOf(signs.charAt(i)) + A[i+1];
        }
        str = str.replaceAll(" ","");
        str = str.replaceAll("-","+-");

        String ints[] = str.split("\\+");
        for(String ss : ints){
            sum += Integer.parseInt(ss);
        }

        if(sum == target){
            System.out.print(ints[0]);
            for(int i = 1; i < ints.length; i++){
                if(!ints[i].contains("-"))
                    System.out.print("+" + ints[i]);
                else
                    System.out.print( ints[i]);
            }
            System.out.println(" = " + sum);
        }
    }

    public static void main(String[] args){
        int i = 1;

        while(Integer.toString(i,3).length() < 8)
            i++;

        while(Integer.toString(i,3).length() < 9) {
            checkSum(Integer.toString(i, 3));
            i++;
        }
    }
}
