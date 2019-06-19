#include<stdio.h>
int main()
{
  //Type your code here
  int n1, n2, n3;
  scanf("%d", &n1);
  n2=n1%10;
  n1=n1/100;
  n3=n1+n2;
  printf("%d",n3);
  return 0;
}