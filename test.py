import time
import datetime as dt


now = dt.datetime.now()
if now.hour < 12:
    print(now.strftime("%d/%m/%y %H:%M:%S"))
    print("It's afternoon")
else:
    print(now.strftime("%d/%m/%y\n" "It's " + "%H:%M:%S"))

# scheduled_time = dt.time(12, 47, 00, 0)
# while 1 == 1:
#   if dt.datetime.now().time() > scheduled_time > (dt.datetime.now() - dt.timedelta(seconds=59)).time():
#      print("Now is the time to print")
#     break

# target_time = '13:07:00'

# now = time.time()
# print(round(now))
print("Hello World")



#print("Hello world")