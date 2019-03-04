package task02.t02_functions;

public class Solution {

    public static String capitalizeName(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }


    public static SolutionBox createBoxUsingWidthLengthHeight(int width, int length, int height){
        return new SolutionBox(width,length,height);
    }
    public static SolutionBox createBoxUsingHeight( int height){
        return new SolutionBox(10,10,height);
    }

}
