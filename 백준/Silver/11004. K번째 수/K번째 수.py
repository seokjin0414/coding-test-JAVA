import sys
input = sys.stdin.readline

# 입력 받기
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 배열을 정렬
A.sort()

# K번째 수 출력 (K는 1-based index 이므로 K-1번째 인덱스를 출력)
print(A[K - 1])