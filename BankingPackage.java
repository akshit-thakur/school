/**contains banking related functions in user generated library.
 * 1. getSimpleInterest(int,double,int) //returns the SI in double form.
 * 2. getMaturityValue(int,int,double) //returns the Maturity Value in Recurring Deposit.
 * 3. getCompundInterest(int,double,int) //returns the compund interest
 * 4. getDividend(int,int,double) //returns the dividend on n number of shares.
 * 5. 
*/
class Banking{
    double getSimpleInterest(int p,double r,int t){
        return (double)(p*r*t)/100;
    }
    double getMaturityValue(int n,int md,double r){
        return (double)(n*md)+(n*(n+1)*r*md/(2*100*12));
    }
    double getCompundInterest(int p,double r,int t){
        return (double)(p*(Math.pow(((100+r)/100),t)));
    }
    double getDividend(int n,int c,double r){
        return (double)(n*c*r)/100;
    }
}