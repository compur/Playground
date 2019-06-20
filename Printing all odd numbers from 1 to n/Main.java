#include <stdio.h>
int main() {
	
	int n,count=1,temp=1;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
  
      if(count%2==1)
      {
        printf("%d\n",count);
       
      }
    
     count=count+1; 
    }
  
	return 0;
}