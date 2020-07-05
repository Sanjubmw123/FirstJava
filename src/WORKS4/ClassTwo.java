package WORKS4;//chaining constructor

class ClassTwo {
	String name;
	int age;
	double num;
	String course;
	
	 ClassTwo(String name,double num,int age) {
     this.age=age;
     this.name=name;
     this.num=num;
}
	 ClassTwo(String course,int age,double num,String name){

	this(name,num,age);
	this.course=course;
}

  void display() {
  System.out.println(name +" " + course   + " "+ num  +" " +age);
 
}
}