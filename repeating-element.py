# Given an array, Find all the repeating elements
# Input: [1,3,4,1,3]
# Output: [1,3]
# Input: [1,9,8,7]
# Output: None /[]
from collections import defaultdict

arr = list(map(int, input().split()))

uniq_list_counter = defaultdict(int)

res = []

for i in arr:
	uniq_list_counter[i] += 1

for x in uniq_list_counter.keys():
	if uniq_list_counter[x]>1:
		res.append(x)

print(res)