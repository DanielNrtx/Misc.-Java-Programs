public class Backwards {
    public static String BackwardsString(String str){
        String strBackwards = "";
        for(int i = str.length()-1; i > -1; i--){
            strBackwards = strBackwards + (str.charAt(i));
        }
        return strBackwards;
    }
}
