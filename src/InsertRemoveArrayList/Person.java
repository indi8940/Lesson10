package InsertRemoveArrayList;

public class Person implements Comparable{
    
    private String name;
    private int age;
    private String gender;
     
    public Person(String nm, int ag, String gn){
        name = nm;
        age = ag;
        gender = gn;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
    public int compareTo(Object o){
        String other = ((Person )o).getName();
        return name.compareTo(other);
    }
    
}
