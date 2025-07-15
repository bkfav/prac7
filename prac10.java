import java.util.*;
class prac10{
	static void revstr(){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String revstr = "";
		for(int i=0; i<str.length(); i++)
			revstr = str.charAt(i) + revstr;
		System.out.println("Given String: "+str+"\nReverse String: "+revstr);
		if(str.equalsIgnoreCase(revstr))
			System.out.println("Pelindrome String");
		else
			System.out.println("Non-pelindrome String");
	}
	static void facto(){
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int tmp = 1;
		for(int i=no; i>0; i--)
			tmp = tmp * i;
		System.out.println("Factorial of "+no+" = "+tmp);
	}
	static void charCount(){
		String s = "asfasdfASDFA@@$@$1231@$2%354sas";
		int cch=0, cno=0, csc=0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
				cch++;
			else if(Character.isDigit(ch))
				cno++;
			else
				csc++;
		}
		System.out.println("Char = "+cch+", Number = "+cno+" SC = "+csc); 
	}
	static void sortarray(){
		int a[] = {15,14,12,13,11};
		for(int i=0; i<=a.length; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i] > a[j]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+",");
	}
	static void startwith(){
		String s1="Hello World!!";
		System.out.println("Given string '"+s1+"' starts with 'Hello'? "+ s1.startsWith("Hello"));
		System.out.println("Given string '"+s1+"' ends with 'World'?"+ s1.endsWith("World"));
	}
	static void prime(){
		int no = 5;
		for(int i=2; i<=no; i++)
			for(int j=2; j<=i; j++)
				if(i%j==0)
					if(i==j)
						System.out.print(i+",");
					else
						break;
	}
	static void fibonanci(){
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int next = 0, prev = 1;
		for(int i=0; i<no; i++){
			System.out.print(next+",");
			int tmp = next + prev; 
			next = prev; 
			prev = tmp; 
		}	
	}
	static void dupary(){
		int a[] = {1,2,3,2,4,3,1,5,2,4,6,5};
		for(int i=0; i<a.length; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]==a[j])
					a[j] = 0;
		for(int i=0; i<a.length; i++)
			if(a[i]!=0)
				System.out.print(a[i]+",");
	}
	static void swapnotext(){
		int a =5, b=10; 
		String s1="Hello", s2="World";
		int len = s1.length();
		System.out.println("Before Swap:\na = "+a+", b = "+b+"\ns1 = "+s1+", s2 = "+s2);
		a = a+b;
		b = a-b;
		a = a-b;
		s1 = s1+s2;
		s2 = s1.substring(0,len);
		s1 = s1.substring(len);
		System.out.println("After Swap:\na = "+a+", b = "+b+"\ns1 = "+s1+", s2 = "+s2);
	}
	public static void main(String[] args){
		//revstr();	
		//facto();
		//charCount();
		//sortarray();
		//startwith();
		//prime();
		//fibonanci();
		//dupary();
		swapnotext();
	}
}