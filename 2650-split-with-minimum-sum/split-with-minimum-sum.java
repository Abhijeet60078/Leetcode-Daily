class Solution {
    public int splitNum(int num) {
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        int num1=0;
        int num2=0;
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                num1=num1*10+(ch[i]-'0');
            }
            else{
                num2=num2*10+(ch[i]-'0');
            }
        }
        return num1+num2;


        
    }
}