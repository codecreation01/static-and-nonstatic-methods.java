import java.util.Scanner;
class QuestionScope {
int sum(int a, int b){ //non-static method
        return a + b;
    }
static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Test3{
public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
QuestionScope st = new QuestionScope();
 int result1=st.sum(n1,n2); // Call the method
int result2=st.multiply(n1,n2); 
System.out.println(result1);
System.out.println(result2);
}
}
