import java.util.Scanner;

class StringArray{
    int n;
    String[] str = new String[50];
    
    void stringinsert(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total no of String you want to insert :- ");
        n = sc.nextInt();
        System.out.println("Now enter all string one by one");
        for(int i=0; i<=n; i++){

            str[i] = sc.nextLine();
        }
        sc.close();
    }

    void comparestring(){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }
    
    void display(){
        System.out.println("Dictionary Order of the entered strings :- ");

        for(int i = 0; i<=n; i++){
            System.out.println(str[i]);
        }
    }
    
}

public class StringSorting {
    public static void main(String[] args) {

        StringArray strarray = new StringArray();
        strarray.stringinsert();
        strarray.comparestring();
        strarray.display();             
    }
}
