import java.util.*;
abstract class StringOperations{
    public abstract String reverse(String s);
    public abstract int vowelCount(String s);
}
abstract class StringReverse extends StringOperations{
    public String reverse(String s){
        String s1="";
        for(int i=s.length() -1; i>=0; i--){
            s1=s1+ s.charAt(i);
        }
        return s1;
    }
}
class UpdatedStrings extends StringReverse{
    public int vowelCount(String s){
        int count=0;
        char[] arr={'a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            for(int j=0;j<arr.length; j++){
                if(s.charAt(i)==arr[j]){
                    count=count+1;
                }
            }
        }
        return count;
    }
}
public class Stringops1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        UpdatedStrings str=new UpdatedStrings();
        sc.close();
        System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
        System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
}
    
