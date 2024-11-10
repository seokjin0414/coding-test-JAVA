N = int(input())  # 파일의 총 개수를 입력받습니다.

arr = []  # 파일 확장자를 저장할 리스트입니다.
dict = {}  # 확장자의 개수를 저장할 딕셔너리입니다.

for i in range(N):
    file = input().split('.')  # 파일명을 '.'으로 분리하여 확장자를 추출합니다.
    arr.append(file[1])  # 확장자 부분을 리스트에 추가합니다.

for i in arr:
    if dict.get(i):  # 딕셔너리에 해당 확장자가 이미 존재하는지 확인합니다.
        dict[i] += 1  # 존재하면 개수를 1 증가시킵니다.
    else:
        dict[i] = 1  # 존재하지 않으면 딕셔너리에 추가하고 개수를 1로 설정합니다.

dict = sorted(dict.items())  # 확장자 이름을 기준으로 딕셔너리를 정렬합니다.

for i, j in dict:
    print(i, j)  # 확장자와 해당 확장자의 개수를 출력합니다.
