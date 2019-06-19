#include<stdio.h>
int main()
{
  //Type your code here
  int n1, sum;
  scanf("%d", &n1);
  sum=n1%10;
  n1=n1/10;
  sum=sum+n1;
  printf("%d",sum);
  return 0;
}