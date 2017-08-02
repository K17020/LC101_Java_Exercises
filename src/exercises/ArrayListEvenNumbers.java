package exercises;

public class ArrayListEvenNumbers {
    public static void main(String[] args){
        int sum = 0;

        for(int num=0;num<10;num=num+2){
            sum=num+sum;
        }
        System.out.print(sum);
    }
}
