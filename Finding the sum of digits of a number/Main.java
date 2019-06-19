#include <stdio.h>
int main() {
	//Type your code
  int num, sum=0, temp=0;
  scanf("%d",&num);
  while(num>0)
  { 
    temp=num%10;
    sum=sum+temp;
    num=num/10;
  }
  printf("%d",sum);
	return 0;
}