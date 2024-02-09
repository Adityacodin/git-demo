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

