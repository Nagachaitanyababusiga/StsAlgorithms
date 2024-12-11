import java.util.*;

public class Class14SwappingTwoNibblesInAByte {
    
    public static int computeUsingSTS(int n){
        int rightpart=n&0b00001111;//(31);//(0x0F);
        int leftpart=n&0b11110000;//240;//(0xF0);
        rightpart=rightpart<<4;
        leftpart=leftpart>>4;
        return (rightpart|leftpart);
    }

    public static void main(String[] args) {
        System.out.println(computeUsingSTS(100));
    }

} 
