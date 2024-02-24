import math
# print("Aditya Mohite")
# print('o=======')
# print('   || ||')
# print('*'*10)

# price = 10
# price = 20
# print(price)
# rating = 4.9
# name = 'mosh'
# is_published = False

# name = input('what is your name')
# print('hi',name)

# print(input('what is yout name? ')+' likes '+input('what is your favorite color? '))

# weight = int(input("Enter weight in pounds: "))
# weight = weight*0.454
# print('You weigh',weight,'kgs')

# course = 'Python\'s  for "Begginer"'
# print(course)

# course = '''hello world'''
# print(course)
# course = 'aditya'
# print((course[-3]))
# print(course[0:3])

# print(course[-len(course)])

# WEIGHT_CONVERTER.py
'''
weight = int(input("weight-> "))
unit = input("(L)bs or (K)gs -> ").upper()
if unit=='L':
    # print("You are",weight*0.454,"kilos")
    print(f"you are {weight*0.454} kilos")
elif unit=='K':
    print(f"You are {math.ceil(weight/0.454)} pounds")
else :
    print("Invalid choice")
'''
### loops :
'''
i=1
while i<=10:
    print("*"*i)
    i+=1
print("done")
'''
# GUESSING GAME : 
''''
secret_no = 9
condition = True
while condition:
    if int(input("Guess-> "))==secret_no:
        print("You win")
        condition = False # // break;
    else:
        print("Nope")
'''
'''
while True:
    command = input("> ").lower()
    if command == "start":
        print("car started.....ready to go")
    elif command == "stop":
        print("car stopped")
    elif command == "help":
        print("start - to start the car")
        print("stop - to stop the car")
        print("exit - to exit the game")
    elif command == "exit":
        print("bye")
        break
    else :
        print("i dont understand that")
'''

# for loops : 
'''
for item in ['mosh','john','sarah']:
    print(item)

for item in range(0,10,2):
    print(item)

prices = [10,20,30]
sum = 0
for i in prices:
    sum += i
print("Total -> {}".format(sum))

times = [2,2,2,2,6]
for i in times:
    output = ''
    for j in range(i):
        output += 'x'
    print(output)
    '''
#  lists
# names = ['bob','josh','jake','drake','katie']
# print(names[-1])
# print(names[:])

# list = [1,7,89,56,43,73,23,67,88,43,799]
'''
largest = -1
for i in range(0,list.__len__()):
    if largest<list[i]:
        largest = list[i]
print(largest)

max = list[0]
for number in list:
    if number > max :
        max = number
print(max)
'''
# 2d list
'''
matrix = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
# matrix[2][2] = 20
# print(matrix)

for row in matrix:
    for item in row:
        print(item)
'''
# list methods

# list = [5,2,1,7,7,4]
# list.insert(4,89)
# list.pop(1)
# list.sort()
# print(list)
# print(type(list))
for i in range(0,3):
    for j in range (0,3):
        list[i][j] = input("Enter element-> ")

for i in rane(0,3):
    for j in range(0,3):
        print(list[i][j],end=" ")
    print("\n")