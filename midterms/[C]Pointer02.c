
#include <stdio.h>

int main() {
   int i = 10;
   int j = 20;
   int *k = &i; //address of i
   
   scanf("%d", k);  //k 가 가리키고 있는데 90을 넣어라
   printf("%d, %d, %d\n", i,j,*k);

    return 0;
}
