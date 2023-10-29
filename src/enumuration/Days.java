package enumuration;

public enum Days {
    MONDAY("monday"),THURSDAY("thursday"),
    WEDNESDAY("wed"),TUESDAY("thus"),FRIDAY("fri"),SATURDAY("satu"),
    SUNDAY("sun");
    private String text;
     Days(String text){
         this.text=text;
    }
    public String getText(){
         return text;
    }
}
