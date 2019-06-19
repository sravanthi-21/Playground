#include <stdio.h>
int main() {
	//Type your code
  int num, n, n1, p, sum=0, i;
    scanf("%d",&num);
  n=num;
    while(n>0)
  {
    n1=n%10;
    p=1;
        //printf("n1 %d\n",n1);
    for(i=1;i<=n1;i++)
    {
      p=i*p;
      //printf("%d\n",p);
    }
    sum=sum+p;
    n=n/10;
  }
  if(sum==num)
  printf("Yes");
  else
      printf("No");
	return 0;
}