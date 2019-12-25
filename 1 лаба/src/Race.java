public class Race {
    private String name;
    private String date;
    private int participants;
    private boolean trophy;
    public Race(String n, String d, int p, boolean t){
        this.name = n;
        this.date = d;
        this.participants = p;
        this.trophy = t;
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public int getParticipants(){
        return participants;
    }
    public boolean isTrophy(){
        return trophy;
    }

    public void printInfo(){
        System.out.println(getName()+getDate()+getParticipants());
        if (trophy){
            System.out.println("Есть трофей");
        }
        else{
            System.out.println("Нет трофея");
        }
    }
}
