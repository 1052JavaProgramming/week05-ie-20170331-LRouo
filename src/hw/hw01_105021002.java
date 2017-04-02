package hw;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Topic: 建立一個Student類別，並用ArrayList進行管理，使用者可以一直輸入，直到使用者按 N or n 才結束，Student的類別裡有name,id及score三個資料成員，同學在加入student物件之後要能依student的score進行遞減排序
 * Date: 2017/04/02
 * Author: 105021002 賴映如
 */
public class hw01_105021002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> dataList = new ArrayList<Student>();
		dataList.add(new Student("Jack", "111111", 100));
		dataList.add(new Student("John", "222222", 66));
		dataList.add(new Student("Jenny", "333333", 87));
		while(true){
			System.out.print("continue?(Y/N): ");
			String ans = scn.next();
			String a="n", b="N",c="Y",d="y";
			if(ans.equals(a)||ans.equals(b)){
				System.out.println("Thank you ~");
				break;
			}
			if(ans.equals(c)||ans.equals(d)){
				System.out.print("Please input name,id and score:　");
				dataList.add(new Student(scn.next(),scn.next(),scn.nextInt()));
				System.out.println("------Before------");
				for(int i=0; i<dataList.size(); i++){
					System.out.println(dataList.get(i).getData()+"\t");
				}
				for(int i=0; i<dataList.size(); i++){
					for(int j=i+1; j<dataList.size(); j++){
						if(dataList.get(i).getScore()>dataList.get(j).getScore()){
							Student tmp = dataList.get(i);
							dataList.set(i, dataList.get(j));
							dataList.set(j, tmp);
						}
					}
				}
				System.out.println("------After------");
				for(int i=0; i<dataList.size(); i++){
					System.out.println(dataList.get(i).getData()+"\t");
				}
			}
		}
	}
}
