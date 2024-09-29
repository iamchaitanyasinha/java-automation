package College;

public class Student extends Student_1  {
    int id; //data member


    void display(){
        System.out.println(id);
//        Student_1 obj1 = new Student_1();
//        int marks2 = obj1.marks2;
        System.out.println("outside main method==="+marks2);
    }
    public static void main(String[] args){
        Student obj = new Student();
        obj.id=90;
        obj.display();
      //  Student_1 obj1 = new Student_1();
        //Cannot use marke variable as it's private;
     //  int marks2=obj1.marks2;
        System.out.println("The marks="+marks2);
    }
}
