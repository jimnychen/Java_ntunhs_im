package hw03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class hw03 {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("請輸入陣列大小");
		    int input = sc.nextInt();
		    int idx = 0;
		    int arr[] = new int[input];
		    int num = arr.length;
		    for (int i=0;i<num;i++) {
		    	arr[i] = sc.nextInt();
		    }
		    idx = num - 1;
		    while(idx>=0) {
		    	System.out.printf("arr[%d]:%d\n",idx,arr[idx]);
		    	idx--;
		    }
		  }	
}

	

