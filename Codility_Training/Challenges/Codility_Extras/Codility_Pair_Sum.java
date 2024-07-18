int sum = 0;

int odd = 0;
int even = 0;
for(int j = 0; j < A.length; j++) {
    if(A[j] % 2 == 0) {
        sum += even;
        even++;
    } else {
        sum += odd;
        odd++;
    }
}