public class getCalculator {
    public static ICalculator getObjCal(String s){
        switch (s){
            case "sum":
                return new Sum();
            case "multiply":
                return new Multiply();
            default:throw new RuntimeException();
        }

    }
}
