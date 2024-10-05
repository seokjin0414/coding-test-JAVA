from collections import deque

def sliding_window_minimum(N, L, A):
    dq = deque()
    result = []

    for i in range(N):
        # 덱의 첫 번째 요소가 슬라이딩 윈도우 범위를 벗어나는 경우 제거
        if dq and dq[0] < i - L + 1:
            dq.popleft()
        
        # 현재 들어오는 값보다 덱의 마지막 값이 크면 그 값 제거
        while dq and A[dq[-1]] > A[i]:
            dq.pop()
        
        # 현재 인덱스를 덱에 추가
        dq.append(i)
        
        # 슬라이딩 윈도우의 최소값을 결과에 추가
        result.append(A[dq[0]])
    
    return result

# 입력 받기
N, L = map(int, input().split())
A = list(map(int, input().split()))

# 결과 출력
result = sliding_window_minimum(N, L, A)
print(' '.join(map(str, result)))