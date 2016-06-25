import random
nomove = False
avr = 0
from datetime import datetime
random.seed(datetime.now())
for i in range(0, 1000):
	x=250
	y=250
	i=0
	Matrix = [[False for ax in range(500)] for ay in range(500)] 
	while nomove==False:
		xory = random.choice([True,False])
		porm = random.choice([-1,1])
		if xory==True:
			if (Matrix[x+porm][y]==False):
				x += porm
				Matrix[x][y]=True
				i += 1
		if xory==False:
			if (Matrix[x][y+porm]==False):
				y += porm
				Matrix[x][y]=True
				i += 1
		if (Matrix[x][y+1]==True and Matrix[x][y-1]==True and Matrix[x+1][y]==True and Matrix[x-1][y]==True):
			nomove=True
			#print(i)
			avr += i
	nomove=False;
print (avr)