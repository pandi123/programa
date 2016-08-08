package working;

public class count {
	public static void main(String[] args) {
		
	
	String s="am23m533makdi";
	char[] a=s.toCharArray();
	String c[]=new String[30];
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(((a[i]>=65)&& (a[i])<=90) || ((a[i])>=97) && (a[i]<=122))
		{
	
			c[i]=String.valueOf(a[i]);
			count++;
			System.out.print(c[i]);
		}
		
	}
	
	System.out.println(count);

}
}
