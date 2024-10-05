import sys
input = sys.stdin.readline

# 계수 정렬을 위한 배열 생성 (10000 이하의 자연수가 주어지므로 10001 크기의 배열)
n = int(input())
arr = [0] * (10000 + 1)

# 입력값을 받아 해당 숫자의 등장 횟수를 기록
for _ in range(n):
    arr[int(input())] += 1

# 배열을 순회하며 각 숫자를 등장 횟수만큼 출력
for i in range(len(arr)):
    if arr[i] != 0:
        for _ in range(arr[i]):
            print(i)