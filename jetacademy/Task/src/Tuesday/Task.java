package Tuesday;

public class Task <T>{
    private T name;
    public Task(T name){
        this.name = name;
    }
    public T getName(){
        return name;
    }
    public void setName(T name){
        this.name = name;
    }

    public static void main(String[] args) {
        Task<String> obj = new Task<>("Arzu");
       // obj.setName(8);

    }
}
