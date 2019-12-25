package package1;

public class  Manager {
    private String name;
    private int age;
    private boolean rabota;
    public Manager(){

    }

    public Manager(String name, int age, boolean rabota){
        this.name = name;
        this.age = age;
        this.rabota = rabota;
    }
    public Manager (Manager o){
        this.name=o.name;
        this.age=o.age;
        this.rabota=o.rabota;
    }
    public Manager(String Name, boolean Rabota){
        this.name = Name;
        this.rabota = Rabota;
    }
    public String getName(){
        return name;
    }
    public boolean isRabota(){
        return rabota;
    }
    public int getAge(){
        return age;
    }

    public static int Age(Manager []manager){
        int p = 0;
        for (int i = 0; i<4; i++){
            p+=(manager[i].age)/4;
        }
        return p;
    }
    public static int hasRabota(Manager []manager){
        int rab = 0;
        for (int i = 0; i<4; i++)
            if(manager[i].rabota)
                rab++;
        return rab;
    }
    public void print(){
        System.out.println(this.getName()+"\n"+this.getAge());
        if(this.isRabota()){
            System.out.println("Справляется с работой.");
        }
        if(!this.isRabota()){
            System.out.println("Не справляется с работой");
        }
    }
}