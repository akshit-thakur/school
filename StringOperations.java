class StringOperations{
    boolean isPalindrome(java.lang.String str){
        StringBuffer word=new StringBuffer(str);
        word=word.reverse();
        return str.equals(word.toString());        
    }
    boolean isPalindromeIgnoreCase(java.lang.String str){
        StringBuffer word=new StringBuffer(str);
        word=word.reverse();
        return str.equalsIgnoreCase(word.toString());
    }    
    boolean isAnagram(java.lang.String str1,java.lang.String str2){
        int sum1=0,sum2=0;
        for(int i=0;i<str1.length();i++){            
            if((Character.isLetterOrDigit(str1.charAt(i))))
            sum1+=(int)str1.charAt(i);
        }        
        for(int i=0;i<str2.length();i++){
            if((Character.isLetterOrDigit(str2.charAt(i))))
            sum2+=(int)str2.charAt(i);
        }         
        return sum1==sum2?true:false;
    }
}