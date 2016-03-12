package sex;

import java.util.LinkedList;
import java.util.Scanner;

public class MillionLights {
	static int [][] grid = new int[1000][1000];
	static Scanner in = new Scanner(System.in);
	static LinkedList<String> input = new LinkedList<>();
	
	static private void init(){
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j]=0;
			}
		}
	}
	static private void getInput(){
		String s = "";
		while( !(s = in.nextLine()).equals(" ")){
			input.add(s.trim());
		}
	}
	
	static private void count(){
		int count =0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if(grid[i][j]==1)count++;
			}
		}
		System.out.println(count);
	}
	static private void turnThem(int k, int l,int m, int n,int onoff){
		for (int i=k; i<=m;i++) {
			for(int j=l;j<=n;j++){
				grid[i][j]=onoff;
			}
		}
	}
	static private void toogleThem(int k, int l,int m, int n){
		for (int i=k; i<=m;i++) {
			for(int j=l;j<=n;j++){
				if(grid[i][j]==1) grid[i][j]=0;
				else grid[i][j]=1;
			}
		}
	}
	
	static private void lightEmUp(){
		int k=0,l=0,m=0,n=0;
		for (int i = 0; i < input.size(); i++) {
			String[] shit = input.get(i).split(" ");
			if(shit[0].equals("turn")){
				k=Integer.parseInt(shit[2].split(",")[0]);
				l=Integer.parseInt(shit[2].split(",")[1]);
				m=Integer.parseInt(shit[4].split(",")[0]);
				n=Integer.parseInt(shit[4].split(",")[1]);
				if(shit[1].equals("on")) turnThem(k, l, m, n, 1);
				else turnThem(k, l, m, n, 0);
			} else {
				k=Integer.parseInt(shit[1].split(",")[0]);
				l=Integer.parseInt(shit[1].split(",")[1]);
				m=Integer.parseInt(shit[3].split(",")[0]);
				n=Integer.parseInt(shit[3].split(",")[1]);
				toogleThem(k, l, m, n);
			}
		}
	}
	public static void main(String[] args) {
		init();
		getInput();
		lightEmUp();
		count();
	}

}
