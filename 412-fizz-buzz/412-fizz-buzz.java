class Solution {
    public List<String> fizzBuzz(int n) {
        String[]res=new String[n];
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
                res[i-1]="FizzBuzz";
            else if(i%3==0)
                res[i-1]="Fizz";
            else if(i%5==0)
                res[i-1]="Buzz";
            else
                res[i-1]=String.valueOf(i);    
        }
        return Arrays.asList(res);
    }
}