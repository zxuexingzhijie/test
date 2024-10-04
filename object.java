public class object{
	public static void main(String[] args){
		cat cat1 = new cat();
		cat1.age = 18;
		cat1.name = "hhh";
		cat1.color = "黄色";
		mytools c3 = new mytools();
		cat cat4 = c3.newperson(cat1);
		System.out.println(cat4.age);
	}
}



class cat{
	String name;
	int age;
	String color;
}

class mytools{
	public cat newperson(cat cat2){
		cat cat3 = new cat();
		cat3.name = cat2.name;
		cat3.age = cat2.age;
		cat3.color = cat2.color;
		return cat3;
	}


}