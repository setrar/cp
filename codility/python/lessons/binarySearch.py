def binary_search(A, x):
    n = len(A)
    beg = 0
    end = n - 1
    result = -1
    while beg <= end:
        mid = (beg + end) / 2
        if A[mid] <= x:
            beg = mid + 1
            result = mid
        else:
            end = mid - 1
    return result


def main():
    cars = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    t = binary_search(cars, 4)
    print(t)


if __name__ == "__main__":
    main()
