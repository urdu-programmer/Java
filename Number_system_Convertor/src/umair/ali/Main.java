package umair.ali;
class Main{
public static void main(String[] args){
	Convertor c = new Convertor();
	
    String decimal = "1001.101";
    int base = 8;
    String deci = c.binary_to_all(decimal, base);
    System.out.println(deci);
}
}