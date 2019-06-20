#include<stdio.h>
int main()
{
  int l,b,v;
  scanf("%d ",&l);
  v=(l/100)%10;
  b=(l%10);
  printf("%d",v+b);
  
  return 0;
}