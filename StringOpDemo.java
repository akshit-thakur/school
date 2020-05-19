class StringOpDemo{    
    public static void main(String args[]){
        StringOperations obj = new StringOperations();
        if(obj.isAnagram("parliament","partial men"))
        System.out.println("Parliament and partial men are anagrams");
        else
        System.out.println("Parliament and partial men are NOT anagrams");
    }
}