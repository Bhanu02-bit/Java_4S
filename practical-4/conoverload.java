class Student { int id; 
String name; 
// Default constructor 
Student() { 
id = 0; 
name = "Not Assigned"; 
} 
// Constructor with one parameter 
Student(int i) { id = i; 
name = "Unknown"; 
} 
// Constructor with two parameters 
Student(int i, String n){ id = i; name = n; 
} 
void display() { 
System.out.println("ID: " + id + " Name: " + name); } 
} 
class conoverload{ 
public static void main(String[] args) { 
Student s1 = new Student(); 
Student s2 = new Student(101); 
Student s3 = new Student(102, 
"Anu"); 
s1.display(); s2.display(); s3.display(); 
}
}