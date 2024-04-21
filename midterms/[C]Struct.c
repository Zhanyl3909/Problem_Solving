#include <stdio.h>

int main() {
    struct insa {
        char name[10];
        int age;
    } 
    
    a[] = { "Kim", 28, "Lee", 38, "Park", 42, "Choi", 31 };
    
    struct insa* p;
    
    p = a;
    p++;
    
    printf("%s ", p->name);
    printf("%d\n", p->age);
	
    return 0;
}

/*
p++을 했기 때문에 그냥 p가 "Lee",38 여기로 감.
그래서 프린트했을때 Lee 38이렇게 나옴.
Lee 38
*/
