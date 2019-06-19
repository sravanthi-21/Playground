#include <stdio.h>
int main() {
	//Type your code
  int l,f,num;
  scanf("%d",&num);
  l=num%10;
  while(num>9)
  {
    num=num/10;
  }
  f=num%10;
  printf("%d",f+l);
	return 0;
}