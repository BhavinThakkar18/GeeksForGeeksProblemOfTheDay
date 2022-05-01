//User function Template for Java

class Solution {
    int superPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        //sieve of eratosthenes to find all prime numbers
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p])
            {
                for(int i=p*p;i<=n;i+=p)
                {
                    prime[i]=false;
                }
            }
        }
        // odd+odd =even (which want be prime)
        // even+odd = odd (can be prime)
       // 2 is the only even prime so in order to be a super prime number has to be a prime and (number-2) has to be a prime.
        int ans=0;
        for(int i=5;i<=n;i++)
        {
            if(prime[i] && prime[i-2])
            {
                ans++;
            }
        }
        return ans;
    }
    
}
