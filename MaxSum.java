import java.util.*;
public class MaxSum
{
	public static void main(String[] args){
		int[] a={1,3,4,-1};
		int sum=0,b=0;
		for(;b<a.length;b++){
			sum=sum+a[b];	
			}
			System.out.println("数组和是"+sum);
		
		for(b=1;b<4;b++){
			if(sum<PSum(a,b+1))
				sum=PSum(a,b+1);
			System.out.println("b次数"+b+" sum "+sum+" PSum(a,b+1) "+PSum(a,b+1));
		}
		//System.out.println(PSum(a,3));
		
		System.out.println("子数组之和最大值是 "+sum);
	}
	static int PSum(int[] num,int a)
	{
		int sum=0,i;
	//	System.out.println("a is "+a);
		if(a==2)
	     	for(i=0;i<num.length-1;i++)
		    	if(sum<num[i]+num[i+1])
				sum=num[i]+num[i+1];
	//	System.out.println("Function2 "+sum);
	
		 if(a==3)
		//	System.out.println("3a is "+a);
			   for(i=0;i<num.length-2;i++)
			        if(sum<num[i]+num[i+1]+num[i+2])
					sum=num[i]+num[i+1]+num[i+2];
					//	System.out.println("Function3 "+sum);
					
		 if(a==4)
				for(i=0;i<num.length-3;i++)
			    	if(sum<num[i]+num[i+1]+num[i+2]+num[i+3])
				    sum=num[i]+num[i+1]+num[i+2]+num[i+3];
				//	System.out.println("Function4 "+sum);
					
		return sum;
	}
}
