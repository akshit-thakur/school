class SalesCommision {
    public static void main(String args[]) {
        float sale = 10000.0f;
        float comm = 0.0f;
        if (sale > 5000 & sale < 12001)
            comm = sale * 0.03f;
        else if (sale > 12000 && sale < 22001)
            comm = sale * 0.07f;
        else if (sale > 22000 && sale < 30001)
            comm = sale * 0.1f;
        else if (sale > 30000)
            comm = sale * 0.15f;
        System.out.println("The sales are Rs. " + sale + " and commission is: " + comm);
    }
}