
public class Palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r,sum=0,temp;
int n=454;
temp=n;
while(n>0) {
	r=n%10;
	sum=(sum *10)+r;
	n=n/10;
	
}
if(temp==sum)
	System.out.print("Palindrome number");
else
	System.out.print("not Palindrome number ");
	}

}
