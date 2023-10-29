package enumuration;

public class DayApp {
    public static void main(String[] args) {
        Days d=Days.MONDAY;
        for (Days h:Days.values()){
            System.out.println(h.getText()+" "+h.ordinal());
        }
    }
}
