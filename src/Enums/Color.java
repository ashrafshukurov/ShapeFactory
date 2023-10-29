package Enums;

public enum Color{
    RED("red"),GREEN("green"),BLACK("black");
    private String value;
    Color(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String text){
        value=text;
    }


}
