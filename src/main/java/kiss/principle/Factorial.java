package kiss.principle;

public class Factorial
{
    public int factorial(int n){
        if(n==0) return 0;
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
}
