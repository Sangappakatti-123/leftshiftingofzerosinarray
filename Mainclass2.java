package com.jspider.p11;

import java.util.Arrays;

public class Mainclass2 {
  public static void main(String[] args) {
	  int []a= {1,2,3,0,4,0,0};
	  mergearray(a);
	  
}
  public static void mergearray(int [] arr1) {
	  int[] res=new int[arr1.length];
	  int x=0;int c=0;
	  for (int i = 0; i < arr1.length; i++) {
		if(arr1[i]==0) {
			c++;
		}
	}
	  for (int i = 0; i < arr1.length; i++) {
		if(i<c) {
			res[x]=0;
			x++;
		}}
	  for (int i = 0; i < arr1.length; i++) {
		  if(arr1[i]!=0) {
				res[x]=arr1[i];
				
				x++;}}
	  
	  System.out.println(Arrays.toString(res));
  }
}
