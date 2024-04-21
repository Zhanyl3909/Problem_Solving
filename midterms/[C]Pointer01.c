#include <stdio.h>
int main(){
  int *arr[3];
  int a = 12, b = 24, c = 36;
  arr[0] = &a;
  arr[1] = &b;
  arr[2] = &c;
 
  printf("%d\n", *arr[1] + **arr + 1);
  return 0;
}

/*
d*arr[1]=24
**arr + 1 = a의 0번째에 있는 12에 1더한값 13이다.
둘이 더하면 37이나옴.
*/
