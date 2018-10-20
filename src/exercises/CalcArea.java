package exercises;

import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args){
        Scanner in;
        float dim1, dim2, area;
        in = new Scanner(System.in);
        System.out.println("type your first dimension: ");
        dim1 = in.nextFloat();
        System.out.println("type your second dimension: ");
        dim2 = in.nextFloat();
        area = dim1 * dim2;
        System.out.print("the area is: ");
        System.out.println(area);

    }
}
