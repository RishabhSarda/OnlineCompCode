testCases = input()
testCases = int(testCases)
for testCase in range(testCases):
    cars = input()
    cars = int(cars)
    x = input().split(" ")
    p = int(x[0])
    rounds = 0
    for i in range(1,len(x)):
        if(p<1):
            break
        p = p + int(x[i])
        p = p-1
        rounds = rounds+1
    rounds = rounds+p
    print(rounds)
