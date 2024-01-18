public class Student {
    String name;
    int age;
    String rollNumber;
    String house;
    

   public Student(String name,int age,String rollNumber,String house){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
        this.house=house;
    }
    @Override
    public String toString() {
        
        return "Student Details:{name:"+name+" ,age:"+age+" ,rollNumber:"+rollNumber+" , house: "+house+"}";
    }
    public static void main(String[] args) {
        Student su=new Student("sumit",22,"24","galcier");
        System.out.println(su);
    }
}
