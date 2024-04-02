
import java.util.Scanner;

public class hw5_1 {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StoreValueCard ntunhs001 = new StoreValueCard("ntuhhs001", 1000);
		String[] funclist = {"儲值","扣款","兌換紅利","查看明細"};
		boolean cont = true; 
		while(cont) {
			System.out.print("請輸入欲操作之功能");
			for(int i=0;i<funclist.length;i++) {
				System.out.print((i+1)+","+funclist[i]);
			}
			System.out.print("0,離開");
			switch (sc.nextInt()) {
			case 1: {
				ntunhs001.addValue();
				break;
			}
			case 2: {
				ntunhs001.charge();
				break;
			}
			case 3:{
				ntunhs001.exchangeBouns();
				break;
			}
			case 4:{
				ntunhs001.printDetails();
				break;
			}
			case 0:{
				cont = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
			}
		}
	}
	
}
class StoreValueCard {
	static Scanner sc = new Scanner(System.in);
	static int TotalCardCount = 0;
	private String cardid;
	private int balance;
	private int bouns;
	StoreValueCard(String id,int money){
		cardid = id;
		balance = money;
		bouns = 0;
		TotalCardCount++;
	}
	StoreValueCard(String id,int money,int bouns1){
		cardid = id;
		balance = money;
		bouns = bouns1;
		TotalCardCount++;
	}
	void addValue() {
		System.out.println("輸入儲值金額:");
		int money = sc.nextInt();
		if (money>=0) {
			bouns +=money/1000;
		 balance+=money;
		}else {
			System.out.println("儲值金額不可為負");
		}
		this.printDetails();
		return;
	}
	void charge(){
		System.out.println("輸入消費金額:");
		int money = sc.nextInt();
		if (money>=0) {
		if(money<=balance) {
			balance-=money;
			}else {
				System.out.println("餘額不足，請加值");
			}
		}else {
			System.out.println("消費金額不可為負");
		}
		this.printDetails();
		return;
	}
	void exchangeBouns(){
		System.out.println("輸入欲兌換紅利:");
		int bouns = sc.nextInt();
		if (bouns>=0) {
		if(bouns<=this.bouns) {
			this.bouns-=bouns;
			}else {
				System.out.println("紅利不足");
			}
		}else {
			System.out.println("欲兌換紅利不可為負");
		}
		this.printDetails();
		return;
	}
	void printDetails() {
		System.out.printf("(%s,%s,%s)\n",this.cardid,this.balance,this.bouns);
	}
	String GetCardid() {
		return cardid;
	}
	int Getbalance() {
		return balance;
	}
	int Getbouns() {
		return bouns;
	}
}
	

