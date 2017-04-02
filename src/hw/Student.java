package hw;
/*
 * Topic: 配合hw01
 * Date: 2017/04/02
 * Author: 105021002 賴映如
 */
public class Student {
	private String name, id;
	private int score;
	
	public Student(String name1, String id1, int score1){
		this.name = name1;
		this.id = id1;
		this.setScore(score1);
	}
	public void setName(String name1){
		this.name = name1;
	}
	public String getName(){
		return this.name;
	}
	public void setId(String id1){
		this.id = id1;
	}
	public String getId(){
		return this.id;
	}
	public void setScore(int score1){
		this.score = score1;
	}
	public int getScore(){
		return this.score;
	}
	public String getData(){
		return this.getName()+"("+this.getId()+"),"+this.getScore();
	}
}
