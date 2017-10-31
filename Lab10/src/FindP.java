
public class FindP {
	
	public static void main(String[] args) {

	    int max = 100001;
	    int a1=0;
	    int a2=0;
	    for ( int i = 9999 ; i >= 1000 ; i--) {
	        if ( max >= i*9999 ) { 
	            break;
	        }
	        for (int j = 9999 ; j >= i ; j-- ) {             
	            int p = i * j;
	            if ( max < p && isPalindrome(p) ) {
	                max = p;
	                a1=i;
	                a2 =j;
	            }
	        }
	    }       
	    System.out.println(max);
	    System.out.println(a1);
	    System.out.println(a2);
	}
	public static boolean isPalindrome(int a) {
	    int rev = 0;                   
	    int x = a;                     
	    while (x > 0) {
	        rev = 10 * rev + x % 10;
	        x /= 10;
	    }
	    return a == rev;      
	}
}
