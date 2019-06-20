#include <stdio.h>
int main() {
	int n,digits=0,r,sum=0,t;
  scanf("%d",&n);
  t=n;
  while(t!=0)
  {
   digits++;
    t=t/10;
  }
  t=n;
   while(t!=0)
  {
    r =t%10;
     sum=sum+pow(r,digits);
       t=t/10;
   }
 if(n==sum)
 {
   printf("Armstrong Number");
 }
  else
  {
   printf("Not an Armstrong Number") ;
  }
	return 0;
}