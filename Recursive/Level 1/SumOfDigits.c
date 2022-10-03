#include<stdio.h>
int sum(int digit){
    // base case
    if(digit == 0){
        return 0;
    }
    // 1246
   return digit%10 + sum(digit/10);
}
int main(){
    int digit;
    scanf("%d", &digit);
    int ans = sum(digit);
    printf("Answer is : %d", ans);
    return 0;
}
