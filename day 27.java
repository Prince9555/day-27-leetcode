class Solution {
    public int sum(int num1, int num2) {
        
        return num1+num2;
    }
}



class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        while(n>0)
        {
            int last=n%10;
            s=s+last;
            p=p*last;
            n=n/10;
        }
        return p-s;
        
    }
}