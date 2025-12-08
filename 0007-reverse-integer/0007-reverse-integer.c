int reverse(int x){
    int rev=0;  
    while(x)
    {   
        if(rev>2147483648/10 || rev<-2147483648/10)
            return 0;
        rev= rev*10+ x % 10;
        x=x/10;
    }
    return rev;
}