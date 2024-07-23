import java.util.*;

class Atriangle {
    Scanner sc = new Scanner(System.in);
    int b;
    int h;
    double area;
    void getdata()
    {
        System.out.println("Enter b value:");
        b = sc.nextInt();
        System.out.println("Enter h value:");
        h = sc.nextInt();
    }

    void cal()
 {
        area = 1.0 / 2.0 * b * h;    
 }

    void disp()
 {
        System.out.println("Output: " + area);
    }
}

class Areaoftrian
 {
    public static void main(String[] args) {
        Atriangle obj = new Atriangle();
        obj.getdata();
        obj.cal();
        obj.disp();
    }
}
