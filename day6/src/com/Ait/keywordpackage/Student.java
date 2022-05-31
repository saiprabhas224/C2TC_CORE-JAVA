package com.Ait.keywordpackage;
 class Student {
	int rollno;
	String name;
	float fee;
    Student(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
    void display()
    {
    	System.out.println(rollno+" "+name+" "+fee);
    }
	public static void main(String[] args) {
		Student obj = new Student(111,"prabhas",4000);
        Student obj1 = new Student(222,"sai",3000);
        obj.display();
        obj1.display();
	}

}
