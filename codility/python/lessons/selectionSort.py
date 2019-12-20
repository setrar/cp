def selectionSort(A):
   n = len(A)
   for k in xrange(n):
      minimal = k
      for j in xrange(k+1, n):
         if A[j] < A[minimal]:
            minimal = j
      A[k], A[minimal] = A[minimal], A[k]

def main():
   cars = [3, 7, 4, 5, 6, 1, 2, 8, 9]
   selectionSort(cars)
   print(cars)
   xs = [5, 6, 1, 2, 8, 9]
   selectionSort(xs)
   print(xs)

if __name__ == "__main__":
    main()