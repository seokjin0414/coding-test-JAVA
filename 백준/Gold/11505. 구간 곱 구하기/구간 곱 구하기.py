import sys
input = sys.stdin.readline

# 두 값을 병합하는 함수입니다. 여기서는 두 값을 곱하는 작업을 수행합니다.
def merge(x, y):
    return x * y

# 세그먼트 트리를 초기화하는 함수입니다.
def init(node, left, right):
    if left == right:  # 리프 노드인 경우
        stree[node] = arr[left]
        return stree[node]
    mid = (left + right) // 2
    # 현재 노드를 자식 노드들의 병합 값으로 설정합니다.
    stree[node] = merge(init(node * 2, left, mid), init(node * 2 + 1, mid + 1, right)) % 1000000007
    return stree[node]

# 구간 [x, y]의 곱을 구하는 함수입니다.
def query(node, left, right, x, y):
    if x <= left and right <= y:  # 구간이 완전히 포함되는 경우
        return stree[node]
    if y < left or x > right:  # 구간이 겹치지 않는 경우
        return 1  # 곱셈의 항등원인 1을 반환합니다.
    mid = (left + right) // 2
    # 자식 노드들로부터 구간 곱을 구합니다.
    return merge(query(node * 2, left, mid, x, y), query(node * 2 + 1, mid + 1, right, x, y)) % 1000000007

# 특정 위치의 값을 갱신하는 함수입니다.
def update(node, left, right, x, y):
    if left == right == x:  # 리프 노드를 갱신하는 경우
        stree[node] = y
        return stree[node]
    if x < left or x > right:  # 갱신할 구간에 포함되지 않는 경우
        return stree[node]
    mid = (left + right) // 2
    # 자식 노드들로부터 값을 갱신합니다.
    stree[node] = merge(update(node * 2, left, mid, x, y), update(node * 2 + 1, mid + 1, right, x, y)) % 1000000007
    return stree[node]

# 입력을 받아 초기 설정을 합니다.
n, m, k = map(int, input().split())  # n: 배열 크기, m: 변경 횟수, k: 구간 곱 계산 횟수
arr = [int(input()) for _ in range(n)]  # 초기 배열 입력
stree = [1] * (n * 4 + 1)  # 세그먼트 트리 배열 초기화

init(1, 0, n - 1)  # 세그먼트 트리 초기화

# m번의 업데이트와 k번의 쿼리를 처리합니다.
for _ in range(m + k):
    a, b, c = map(int, input().split())
    if a == 1:  # 업데이트 연산인 경우
        arr[b - 1] = c
        update(1, 0, n - 1, b - 1, c)
        continue
    # 구간 곱 쿼리인 경우
    print(query(1, 0, n - 1, b - 1, c - 1))
