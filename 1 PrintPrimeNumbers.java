import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class PrimeNumber{
    int start;
    int end;
    ArrayList<Integer> primeNoList = new ArrayList<Integer>();

    PrimeNumber(){ }

    void setRange(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting and ending range of number :- ");
        start = sc.nextInt();
        end = sc.nextInt();
        System.out.println();

        sc.close();
    }

    boolean isPrime(int no){
        
        int i,m=0,flag=0;      
        int n=no;       
        if(n==0||n==1){  
            flag=1;     
        }else{  
            for(i=2;i<=n/2;i++){      
             if(n%i==0){          
                 flag=1;      
                 return false;     
                 }      
            }      
        if(flag==0)
          { 
            primeNoList.add(no);
          }  
         }
         return true;
        
    }

    void printList(){
        System.out.print("Prime numbers out of given range :- ");
        System.out.print( primeNoList + "  " );
    }
}

public class PrintPrimeNumbers{
    public static void main(String[] args) {
        PrimeNumber  pnum = new PrimeNumber();

        pnum.setRange();
        for(int i = pnum.start; i<=pnum.end; i++){
            boolean success = pnum.isPrime(i);
        }

        pnum.printList();
    }
}