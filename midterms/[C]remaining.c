#include <stdio.h>

main()
{
	int a;
	int b;
	int i;
	int x,y,z;

	printf("a ? "); scanf("%d",&a);
	printf("b ? "); scanf("%d",&b);
	
	x = 1234567890;

	y = x;
	for(i = 0; i < a-1; i++) {
		y = y / 10;
	}
	y = y % 10;

	z = 1000000000;
	for(i = 0; i < b-1; i++) {
		x = x - x/z*z;
		z = z / 10;
	}
	
	while (x > 10) {
		x = x / 10;
	}

	z = y*10 + x;
	printf("result = %d\n",z);
}
