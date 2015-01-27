import java.io.*;

public class BubbleSort{
	public static void main(String[] args){
		int[] array = new int[] {4,5,6,7,8,9,1,2,3,0};
		int tmp;

		System.out.println("排序之前");
		printArray(array);	//遍历数组方法


		//冒泡 从小到大
		for(int i=1; i<array.length; i++){
			for(int j=0; j<array.length-i; j++){
				if(array[j] > array[j+1]){
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}

		System.out.println("排序结果一");
		printArray(array);
	
		//从大到小
		for(int i=1; i<array.length; i++){
			for(int j=0; j<array.length-i; j++){
				if(array[j] < array[j+1]){	//><符号区别
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}

		System.out.println("排序结果二");
		printArray(array);
	}

	public static void printArray(int[] array){
		for(int i: array){
			System.out.print(i+",");
		}
		System.out.println("\n ");
	}
	

}



