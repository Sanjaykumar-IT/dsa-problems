# Given an array arr[] of n integers, 
# construct a Product Array prod[] (of the same size) such that 
# prod[i] is equal to the product of all the elements of arr[] except arr[i].
# Input: [10, 3, 5, 6, 2]
# output: [180, 600, 360, 300, 900]

arr = list(map(int, input().split()))

res = []
n = len(arr)

for i in range(n):
	prod = 1
	for j in range(n):
		if i!=j:
			prod *= arr[j]
	res.append(prod)

print(res)