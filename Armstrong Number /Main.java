#include <stdio.h>
int main() {
	//Type your code
  int num, n, count=0,n1=0,i,sum=0, p;
  scanf("%d",&num);
  n=num;
  while(n>0)
  {
    n=n/10;
    count++;
  }
  //count++;
  n=num;
  //printf("%d",n);
  while(n>0)
  {
    n1=n%10;
    p=1;
    for(i=0;i<count;i++)
      p=p*n1;
    sum=sum+(p);
      //  printf("%d %d\n",sum,sum);
    n=n/10;
  }
  if(num==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");

	return 0;
}
