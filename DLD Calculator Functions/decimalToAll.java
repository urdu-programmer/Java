class Hello{
	public static String reverse(String value) {
		String reversed = "";
		for(int i = 0; i < value.length(); i++) {
			reversed = reversed + value.charAt(value.length()-1-i);
		}
		return reversed;
	}
	static boolean isFloat(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '.') {
				return true;
			}
		}
		return false;
	}
    public static String decimal_to_binary(String str, int base){
        double num = Double.parseDouble(str);
        int whole_part = (int) num;
        double fractional_part = num - whole_part;
        String digit, bin = "";
        while(whole_part != 0){
            digit = String.valueOf(whole_part%base);
            bin = bin + digit;
            whole_part = whole_part / base;
        }
        String fraction = "";
        
        double num1;
        do {
        	num1 = fractional_part * base;
        	
        	int b_dig = (int) num1;
        	fraction = fraction + b_dig;
        	fractional_part = num1 - b_dig;
        }while(fractional_part != 0);
        if(base == 16) {
        	switch (bin) {
        	case "10":
        		bin = "A";
        		break;
        	case "11":
        		bin = "B";
        		break;
        	case "12":
        		bin = "C";
        		break;
        	case "13":
        		bin = "D";
        		break;
        	case "14":
        		bin = "E";
        		break;
        	case "15":
        		bin = "F";
        		break;
        	}
            if(isFloat(str)) {
            	return reverse(bin) + "." + fraction;
            }
            return reverse(bin);
        }
        if(isFloat(str)) {
        	return reverse(bin) + "." + fraction;
        }
        return reverse(bin);
    }
    public static void main(String[] args){
        String decimal = "369.3125";
        int base = 16;
        String bin = decimal_to_binary(decimal, base);
        System.out.println(bin);
    }
}
