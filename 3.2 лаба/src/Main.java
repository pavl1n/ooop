interface Personnage{
   public String Attack();
}
interface Object{
    void printInfo();
}

class Warrior implements Personnage,Object {
    private String name;
    private int HP;
    private int strength;
    private int guilt;
    String attack;
    private int lvl;
    private String weapon;
    private String shield;
    public Warrior(String n, int hp, int s, int g, String w, String sh, int l){
        this.name = n;
        this.HP = hp;
        this.strength = s;
        this.guilt = g;
        this.lvl = 20;
        this.weapon = w;
        this.shield = sh;
    }
    public Warrior(String n, int hp, int s, int g){
        weapon = "булава";
        shield = "квадратный";
    }
    public Warrior() {

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
    public int getLvl(){
        return lvl;
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

    public void printInfo() {
        System.out.println("Персонаж №2:"+getName()+"; Здоровье: "+getHP()+"; Сила: "+getStrength()+"; Ловкость: "+getGuilt()+"; Тип оружия: "+ getWeapon()+ "; Тип щита: " + getShield()+"\nТип атаки:"+Attack());
        System.out.println("Уровень героя:" + getLvl());
    }
}
abstract class Monster implements Personnage, Object {
    private String name;
    private int HP;
    private int strength;
    private int guilt;
    String attack;
    public int lvl;
    private int lengthOfTooths;
    private int lengthofClaws;
    private int numberOfPaws;
    public Monster(String n, int hp, int s, int g, int t, int c, int p, int l){
        this.name = n;
        this.HP = hp;
        this.strength = s;
        this.guilt = g;
        this.lengthOfTooths = t;
        this.lengthofClaws = c;
        this.numberOfPaws = p;
        this.lvl=l;
    }
    public Monster(String n, int hp, int s, int g){
        lengthOfTooths = 15;
        lengthofClaws = 25;
        numberOfPaws = 6;
    }
    public Monster(){

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
    public int getLvl(){
        return lvl;
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
}
class Boss extends Monster{
    public Boss (String n, int hp, int s, int g, int t, int c, int p, int l){
        super(n,hp,s,g,t,c,p,l);
    }
    public String Attack(){
        attack = "Удар когтями";
        return attack;
    }
    public void printInfo() {
        System.out.println("Персонаж №3:"+getName()+"; Здоровье: "+getHP()+"; Сила: "+getStrength()+"; Ловкость: "+getGuilt()+"; Длина зубов: "+ getLengthOfTooths()+"; Длина когтей: "+ getLengthofClaws() +"; Количество лап: " +getNumberOfPaws() + "\nТип атаки:"+Attack());
        System.out.println("Уровень героя: "+ getLvl());
    }
}
class Fast_Monster extends Monster{
    public Fast_Monster (String n, int hp, int s, int g, int t, int c, int p, int l){
        super(n,hp,s,g,t,c,p,l);
    }
    public String Attack(){
        attack = "Удар с пыру";
        return attack;
    }
    public void printInfo() {
        System.out.println("Персонаж №4:"+getName()+"; Здоровье: "+getHP()+"; Сила: "+getStrength()+"; Ловкость: "+getGuilt()+"; Длина зубов: "+ getLengthOfTooths()+"; Длина когтей: "+ getLengthofClaws() +"; Количество лап: " +getNumberOfPaws() + "\nТип атаки:"+Attack());
        System.out.println("Уровень героя: "+ getLvl());
    }
}
class Magician implements Personnage, Object {
    private String name;
    private int HP;
    private int strength;
    private int guilt;
    String attack;
    private int lvl;
    private String typeOfMagick;
    public Magician(String n, int hp, int s, int g, String m, int l){
        this.name = n;
        this.HP = hp;
        this.strength = s;
        this.guilt = g;
        this.typeOfMagick = m;
        this.lvl = l;
    }
    public Magician(String n, int hp, int s, int g){
        this.lvl = 40;
        typeOfMagick = "снежный вихрь";
    }
    public Magician(){

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
    public int getLvl(){
        return lvl;
    }
    public String getTypeOfMagick(){
        return typeOfMagick;
    }
    public String Attack(){
        attack = "Колдовство";
        return attack;
    }

    public void printInfo() {
        System.out.println("Персонаж №5:"+getName()+"; Здоровье: "+getHP()+"; Сила: "+getStrength()+"; Ловкость: "+getGuilt() +"; Тип магии: " + getTypeOfMagick() + "\nТип атаки:"+Attack());
        System.out.println("Уровень героя: "+ getLvl());
    }
}
class Main{
    public static void main(String args[]){
        Personnage hero1 = new Warrior("Рики", 250, 100, 10, "топор", "овальный", 15);
        ((Warrior) hero1).printInfo();
        Personnage hero2 = new Boss("Акс", 500, 500, 250, 10, 20, 4, 24);
        ((Boss) hero2).printInfo();
        Personnage hero3 = new Fast_Monster("Снежок", 300, 200, 688, 5, 10, 2, 85);
        ((Fast_Monster) hero3).printInfo();
        Personnage hero4 = new Magician("Магистр", 800, 100, 100, "снежный ком", 99);
        ((Magician)hero4).printInfo();
    }
}


