n = int(input()) #입력 개수
fib = [0, 1] #입력 개수가 90 이상인 조건이 있으므로 피보나치수 0,1 저장 

for i in range(2, n + 1): #리스트에 피보나치 수 계산하여 저장
    fib.append(fib[i-1] + fib[i-2])
print (fib[n]) #출력