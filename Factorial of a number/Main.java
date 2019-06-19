#include <stdio.h>
int main() {
	//Type your code
  int num, p=1, i;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
    p=p*i;
  }
  printf("%d",p);
	return 0;
}
