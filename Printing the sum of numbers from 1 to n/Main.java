#include <stdio.h>
int main() {
	int n,sum=0,count=1;
  scanf("%d",&n);
  for(int i=0;i<1;i++)
  {
    while(n>=count)
    {
    sum=sum+count;
    count=count+1;
    }
      printf("%d",sum);
  }
  
	return 0;
}