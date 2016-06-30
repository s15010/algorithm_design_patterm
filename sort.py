#!/usr/bin/python3
LIST_COUNT = 1000
LOOP_COUNT = 1000
MAX_NUM = 10000

def data_generate():
    import random
    return [random.randint(1, MAX_NUM) for _ in range(LIST_COUNT)]

def selection_sort(data):
    for i in range(len(data) - 1):
        minimum = i

        for t in range(i + 1, len(data)):
            if data[minimum] > data[t]:
                minimum = t

        data[i], data[minimum] = data[minimum], data[i]


def bubble_sort(data):
    for i in range(len(data)):
        for t in range(1, len(data) - i):
            if data[t] < data[t-1]:
                data[t], data[t-1] = data[t-1], data[t]

def insertion_sort(data):
    for i in range(1, len(data)):
        tmp = data[i]
        if data[i-1] > tmp:
            j = i
            while j > 0 and data[j-1] > tmp:
                data[j] = data[j-1]
                j -= 1
            data[j] = tmp

def insertion_sort(data):
    for pos in range(1, len(data)):
    ins = pos
    data.insert(0, data[pos])



def shell_sort(data):
    gap = len(data) // 2
    while gap > 0:
        for i in range(gap, len(data)):
            tmp = data[i]
            j = i - gap
            while j >= 0 and tmp < data[j]:
                data[j+gap] = data[j]

def merge_sort(data):
    #{{{
    mid = len(data)
    if mid <= 1:
        #要素数が１以下ならそのまま返す
        return data
    '''
    #リストを分割して再帰ソート
    left = merge_sort(data[:(mid//2)])  #左半分
    right = merge_sort(data[(mid//2):]) #右半分
    left = marge_sort(left)
    right = marge_sort(right)
        #分別したリストを結合(マージ)する
        array = []
        while len(left) != 0 and len(righth) !=0:
            if left[0] < right[0]:
                array.append(left.pop(0))
            else:
                array.append(right.pop(0))

        if len(left) != 0:
            #左端にデータが残っていたらそのまま末端にマージ
            array.extend(left)
        elif len(right) != 0:
            #右端にデータが残っていたらそのまま末端にマージ
            array.extend(right)
        return array
        #}}}
    '''
def quick_sort(data):
    #{{{
    if len(data) = 1:
      return data
    pivot = data[0]
    left = []
    right = []

    for x in range(1, len(data)):
        if data[x] <= pivot:
            left.append(data[x])
        else:
            right.append(data[x])

    left = quick_sort(left)
    right = quick_sort(right)

    return left + [pivot] + right
    #}}}


if __name__ == '__main__':
    import time
    import sys
    '''
    start = time.time()

    for i in range(LOOP_COUNT):
        data = data_generate()
        selection_sort(data)
        print(',', end='')
        sys.stdout.flush()

    end = time.time()
    print('経過時間:', (end-start))
    print('平均時間', ((end-start) / LOOP_COUNT))

    start = time.time()


    for _ in range(LOOP_COUNT):
        data = data_generate()
        bubble_sort(data)
        [print(',', end='') if _ % 100 != 99 else print(int(_ / 100 + 1))]
        sys.stdout.flush()
    end = time.time()
    print()
    print('経過時間、', (end-start))
    print('平均時間、', ((end-start) / LOOP_COUNT))
    '''
    #data = data_generate()
    #insertion_sort(data)
    #print(data)


    start = time.time()

    for i in range(LOOP_COUNT):
        data = data_generate()
        quick_sort(data)
        print(',', end='')
        sys.stdout.flush()

    end = time.time()
    print('経過時間:', (end-start))
    print('平均時間:', ((end-start) / LOOP_COUNT))


