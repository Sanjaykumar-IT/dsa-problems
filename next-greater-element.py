'''
Given an array, find the next greatest element and return an array
return -1 if there is no greater element
For Example,
Input: [19, 12, 34,78,8]
Output: [34,34,78,-1,-1]
'''
arr = list(map(int, input().split()))

def find_next_greatest(inp):
	res = []
	n = len(inp)
	for i in range(n):
		j = i + 1
		f = True
		while (j<n) and f:
			if inp[i] < inp[j]:
				f = False
				res.append(inp[j])
			j+=1
		else:
			if f:
				res.append(-1)
	return res



print(find_next_greatest(arr))