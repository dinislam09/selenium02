package com.fb.test;
public class GroupTwo {
	
public static void main(String[] args) {
	
	String a="Md Din Islam";
	String a1="Md Manik Vai";
	String re="";
	String []r=a1.split("");
	//for(int i=r.length-1;i>=0;i--) 
	//	re=re.concat(r[i]).concat(" ");
	//	System.out.println(re);
	
	
	//String[] c=a1.split(" ");
	//for (int i=0;i<c.length ;i++)
	//if(c[i].equals("Manik"))
	//System.out.println(c[i]);
	
	String m=a1.substring(5);
	System.out.println(m);
	String m1=a1.substring(3, 8);
	System.out.println(m1);

}
}
