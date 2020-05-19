class AmphotericNumList {
    public static void main(String agrs[]) {
        AmphotericNum obj = new AmphotericNum(); /* for calling the function isAmphoteric(int) */
        System.out.println("The list of amphoteric numbers upto 1000 is:");
        for (int i = 0; i < 1000; i++) {
            if (obj.isAmphoteric(i))
                System.out.println(i);
        }
    }
}