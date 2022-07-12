package umair.ali;
class Main{
public static void main(String[] args){
	
	Convertor c = new Convertor();
	// decimal to all number system
    String decimal = "214.390625";
    int base = 2;
    String resul1 = c.decimal_to_all(decimal, base);
    System.out.println(resul1);
    
    // binary to all number system
    
    String binary = "11010110.011001";
    base = 2;
    String resul2 = c.binary_to_all(binary, base);
    System.out.println(resul2);
    
    //octal to all number system
    String octal = "326.31";
    base = 2;
    String resul3 = c.octal_to_all(octal, base);
    System.out.println(resul3);
    //hex to all number system
    String hex = "D6.64";
    base = 2;
    String resul4 = c.hex_to_all(hex, base);
    System.out.println(resul4);


}
}