class Solution {
    public int reverse(int x) {
       String max="2147483647";
        if(x==-2147483648)
            return 0;
        String number="";
        int flag=0;
        if(x<0)
        {
          flag=1;
          x=-x;  
        }
        while(x!=0)
        {
            number=number+Integer.toString(x%10);
            x/=10;  
        }
        System.out.println(number);
        int len=number.length();
        for(int i=0;i<max.length()-len;i++)
            number="0"+number;
        if(flag==0)
        {
            if(number.compareTo(max)>0)
                return 0;
            else
                return Integer.parseInt(number);
        }
        else
        {
            System.out.println(number.compareTo(max));
            if(number.compareTo(max)>0)
                return 0;
            else
                return -(Integer.parseInt(number));
        }
    }
}