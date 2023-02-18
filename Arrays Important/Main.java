class Main {
    public static void main(String[] args) {
        System.out.println(countOdds(8, 10));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String ans = "";
        int elm1 = 0,elm2 = 0;
        while((i >= 0) || (b >= 0)){
            if(i >= 0){
                elm1 = a.charAt(i) - '0';
                i--;
            }else{
                elm1 = 0;
            }
            if(j >= 0){
                elm2 = a.charAt(j) - '0';
                j--;
            }else{
                elm2 = 0;
            }

            if(elm1 + elm2 + carry == 2){
                ans = "0" + ans;
                carry = 1;
            }else if(elm1 + elm2 + carry == 1){
                carry = 0;
                ans = "1" + ans;
            }
            return ans;
        }
    }
}