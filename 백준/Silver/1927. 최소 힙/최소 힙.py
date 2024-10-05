import sys  # 시스템 관련 기능을 가져오는 라이브러리
import heapq  # 힙(우선순위 큐) 기능을 제공하는 라이브러리

i = sys.stdin.readline  # 입력을 빠르게 받기 위한 readline 함수 사용 (대량 입력일 때 유리)
n = int(input())  # 연산의 개수 N을 입력 받음
q = []  # 최소 힙을 저장할 리스트 초기화

for _ in range(n):  # N번의 연산을 처리하는 반복문
    x = int(i())  # 입력값을 정수로 변환하여 변수 x에 저장
    if x == 0:  # x가 0일 경우
        if len(q) == 0:  # 힙이 비어 있으면
            print(0)  # 0을 출력
        else:
            print(heapq.heappop(q))  # 힙에서 가장 작은 값을 제거하고 출력
    else:  # x가 0이 아닌 경우 (자연수일 경우)
        heapq.heappush(q, x)  # x를 최소 힙에 추가
