class NumConvDemo {
    public static void main(String args[]) {

        NumberConverter obj = new NumberConverter();
        java.lang.String binary = "101010";
        java.lang.String hexa = "37AE";
        java.lang.String octal = "765";
        int decimal = 100;
        System.out.println(obj.addBinary(3, 4));
        System.out.println("The binary of decimal " + decimal + " is: " + obj.decimalToBinary(decimal));
        System.out.println("The binary of octal " + octal + " is: " + obj.octalToBinary(octal));
        System.out.println("The binary of hexadecimal " + hexa + " is: " + obj.hexaToBinary(hexa));
        System.out.println("The octal of binary " + binary + " is: " + obj.binaryToOctal(binary));
        System.out.println("The octal of decimal " + decimal + " is: " + obj.decimalToOctal(decimal));
        System.out.println("The octal of hexadecimal " + hexa + " is: " + obj.hexaToOctal(hexa));
        System.out.println("The decimal of binary " + binary + " is: " + obj.binaryToDecimal(binary));
        System.out.println("The decimal of octal " + octal + " is: " + obj.octalToDecimal(octal));
        System.out.println("The decimal of hexadecimal " + hexa + " is: " + obj.hexaToDecimal(hexa));
        System.out.println("The hexadecimal of binary " + binary + " is: " + obj.binaryToHexa(binary));
        System.out.println("The hexadecimal of octal " + octal + " is: " + obj.octalToHexa(octal));
        System.out.println("The hexadecimal of decimal " + decimal + " is: " + obj.decimalToHexa(decimal));
    }
}