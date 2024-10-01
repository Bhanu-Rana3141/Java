
/*
reference of string can be changed
Q. Why immutability ?
- due to interning problem , 
*/  


public class printSubstrings {
    
    public static void main(String[] args) {
        String str = "abcd";
        
        for(int i = 0; i<str.length(); i++) {
            for(int j = i; j<str.length(); j++) {
                System.out.println(str.substring(i, j+1));
            }
            System.out.println();
        }
    }
}
