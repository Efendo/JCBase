import java.util.Random;
import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math;

class numgen{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Base: ");
	int base = Integer.valueOf(scan.nextLine());
	System.out.print("Bits:");
	int bits = Integer.valueOf(scan.nextLine());
	HashSet<String> LON = new HashSet<String>();
	while(LON.size() < (int) Math.pow(base, bits)) {
	    LON.add(GenNum(bits, base));
	}
	System.out.println(LON);
	scan.close();
    }

    public static String GenNum(int bits, int base) {
	Random bit = new Random();
	int i;
	String Num = "";
	for(i=0;i<bits;i++) {
	    Num += bit.nextInt(base) + "";
	}
	    return Num;
    }
}
