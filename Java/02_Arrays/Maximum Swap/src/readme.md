# MAXIMUM SWAP    
Problem Statement:
Given a positive integer N, you can do the following operations at most once

a) Swap 2 digits of the integer N.

You need to determine the largest integer you can get by performing the above operation at most once

### Constraints:
1 <= T <= 10

1<= N <= 10^9

Time limit : 1 sec

### Sample input 1:
2

4589

99538

### Sample output 1:

9584

99835

### Explanation of Sample input 1:
For the first test case, swap the first digit with the last digit, So, return 9584.

For the second test case, swap the third digit with the last digit. So, return 99835.

### Sample Input 2:
2

4321

18

### Sample Output 2:
4321

81

Explanation Of Sample Input 2:

For the first test case, the number given is biggest among all possible answers, So, return 4321.

For the second test case, swap the first digit with the last digit. So, return 81.
