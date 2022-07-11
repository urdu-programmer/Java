package umair.ali;

class Convertor{
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
    public  String decimal_to_all(String str, int base){
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
    public String binary_to_all(String bin, int base) {
        double num = Double.parseDouble(bin);
        int whole = (int)num;

        String wholeStr = whole + "";
        int decimal = 0;
        int i;
        for(i = 0; i < wholeStr.length(); i++){
            int digit = Integer.parseInt(wholeStr.charAt(wholeStr.length()-1-i)+"");
            decimal = decimal + (digit * (int) Math.pow(2, i));
        }
        double frac = 0;
        int k = -1;
        for(int j = i+1; j < bin.length(); j++){
            double digit = Integer.parseInt(bin.charAt(j) +"");
            frac = frac + (digit * Math.pow(2, k));
            k--;
        }
        String deci = (decimal + frac) + "";
        if(base == 10) {
            return  deci;
        }
        else {
        	String result = decimal_to_all(deci, base);
        	return result;
        	
        }
    }
}