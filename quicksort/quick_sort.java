#!/usr/bin/python3
LOOP_COUNT = 5000
LIST_COUNT = 1000
MAX_NUM = 10000

def data_generate():
    import random
    return [random.randint(1, MAX_NUM) for _ in range(LIST_COUNT)]

def quick_sort(data):
    if len(data) < 1:
        return data
    pivot = data[0]
    left = []
    right = []
    for x in range(1,len(data)):
        if data[x] <= pivot:
            left.append(data[x])
        else:
            right.append(data[x])
    left = quick_sort(left)
    right = quick_sort(right)

    return left + [pivot] + right

def quick_sort2nd(data):
    if len(data) <= 64:
        return insertion_sort(data)
    pivot = data[0]

    left = []
    right = []
    for x in range(1,len(data)):
        if data[x] <= pivot:
            left.append(data[x])
        else:
            right.append(data[x])

    left = quick_sort(left)
    right = quick_sort(right)

def insertion_sort(data):
    for i in range(1, len(data)):
        tmp = data[i]
        if data[i-1] > tmp:
            j = 1
            while j > 0 and data[j-1] > tmp:
                data[j] = data[j-1]
                j -= 1
            data [j] = tmp


if __name__ == '__main__':
    import time
    import sys

    start = time.time()
    for _ in range(10000):
        data = data_generate()
        quick_sort(data)
        sys.stdout.flush()
    end = time.time()
    print('初期クイックソート')
    print('経過時間、', (end-start))
    print('平均時間、', ((end-start) / 10000))

    start = time.time()
    for _ in range(10000):
        data = data_generate()
        quick_sort2nd(data)
        sys.stdout.flush()
    end = time.time()
    print('クイックソート2nd')
    print('経過時間、', (end-start))
    print('平均時間、', ((end-start) / 10000))
