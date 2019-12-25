 class Personnage {
    private String name;
    private int HP;
    private int strength;
    private int guilt;
    String attack;
     public void print() {
         System.out.println("Персонаж :"+getName()+ "; Здоровье: "+getHP()+"; Сила: "+getStrength() + "\nТип атаки:"+Attack());
     }
     public Personnage(String n, int hp, int s, int g) {
        this.name = n;
        this.HP = hp;
        this.strength = s;
        this.guilt = g;
    }
    public Personnage(String n, int s, int g){
        this.name = n;
        this.strength = s;
        this.guilt = g;
    }
    public Personnage(){

    }
    public String getName(){
        return name;
    }
    public int getHP(){
        return HP;
    }
    public int getStrength(){
        return strength;
    }
    public int getGuilt(){
        return guilt;
    }
    public String Attack(){
        attack = "Удар ножом";
        return attack;
    }
}
class Warrior extends Personnage{
    private String weapon;
    private String shield;
    public Warrior(String n, int hp, int s, int g, String w, String sh){
        super(n,hp,s,g);
        this.weapon = w;
        this.shield = sh;
    }

    public Warrior(String n, int hp, int s, int g){
        super(n,hp,s,g);
        weapon = "булава";
        shield = "квадратный";
    }
    public Warrior() {

    }
    public String getWeapon(){
        return weapon;
    }
    public String getShield(){
        return shield;
    }
    public String Attack(){
        attack = "Удар с вертухи";
        return attack;
    }
    public void print() {
    super.print();
        System.out.println("Оружие: "+ getWeapon() + " Щит: "+ getShield());
    }
}
class Monster extends Personnage{
    private int lengthOfTooths;
    private int lengthofClaws;
    private int numberOfPaws;
    public Monster(String n, int hp, int s, int g, int t, int c, int p){
        super(n,hp,s,g);
        this.lengthOfTooths = t;
        this.lengthofClaws = c;
        this.numberOfPaws = p;
    }

    public Monster(String n, int hp, int s, int g){
        super(n,hp,s,g);
        lengthOfTooths = 15;
        lengthofClaws = 25;
        numberOfPaws = 6;
    }
    public Monster(){

    }
    public int getLengthOfTooths(){
        return lengthOfTooths;
    }
    public int getLengthofClaws(){
        return lengthofClaws;
    }
    public int getNumberOfPaws(){
        return numberOfPaws;
    }

    public String Attack(){
        attack = "Удар <<кама пуля>>";
        return attack;
    }
    public void print() {
        super.print();
        System.out.println("Длина зубов: " + getLengthofClaws() + " Длина зубов: "+ getLengthOfTooths() + " Количество лап: " + getNumberOfPaws());
    }
}
class Magician extends Personnage{
    private String typeOfMagick;
    public Magician(String n, int hp, int s, int g, String m){
        super(n,hp,s,g);
        this.typeOfMagick = m;
    }
    public Magician(String n, int hp, int s, int g){
        super(n,hp,s,g);
        typeOfMagick = "снежный вихрь";
    }
    public Magician(){

    }
    public String getTypeOfMagick(){
        return typeOfMagick;
    }
    public String Attack(){
        attack = "Колдовство";
        return attack;
    }
    public void print(){
    super.print();
        System.out.println(" Тип магии: " + getTypeOfMagick());
    }
}
class Main{
    public static void main(String args[]){
        Personnage hero1 = new Personnage("Рики", 500, 100, 98 );
        hero1.print();
        Warrior hero2 = new Warrior("Мясник", 250, 100, 10, "топор", "овальный");
        hero2.print();
        Monster hero3 = new Monster("Магистр", 500, 500, 250, 10, 20, 4);
        hero3.print();
        Magician hero4 = new Magician("Снежок", 25, 1, 1, "снежный ком");
        hero4.print();
    }
}


