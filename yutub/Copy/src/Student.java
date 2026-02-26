public class Student implements Cloneable{
    private String name;
    public String getName(){
        return name;
    }
        public void setName(String name){
            this.name=name;
    }
    @Override
    public Student clone()  {
        try{Student clone= (Student)super.clone();
        clone.setName(this.getName());
        return clone;}
        catch( CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
