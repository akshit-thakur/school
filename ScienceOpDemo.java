class ScienceOpDemo{
    public static void main(String args[]){
        ScienceOperations obj=new ScienceOperations();
        System.out.println("100°C = "+obj.convertToF(100)+" °F");
        System.out.println("32°F = "+obj.convertToC(32)+" °C");
    }
}