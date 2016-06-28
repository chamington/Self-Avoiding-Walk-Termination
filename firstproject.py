#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      student
#
# Created:     27/06/2016
# Copyright:   (c) Michael Golub and a lot of random people on stackoverflow
# Licence:     <A lawyer>
#-------------------------------------------------------------------------------
# Types of materials and values:
# 0: Blank space, usually rewritten
# 1: The path, never rewritten unless ran again.  Also acts like a wall or a dam
# 2: The water that is poured out of the path in a new matrix
# 3: The border to prevent an out-of-bounds error and to know weather water reached it

import turtle
import random
import pygame
import sys
import tkinter
pygame.init()
screen_width = 640
screen_height = 460
from pygame.locals import *
nomove = False
avr = 0
from datetime import datetime
random.seed(datetime.now())
turtle.clear()
turtle.ht()
turtle.speed(speed=0)
for i in range(0, 10):
	x=250
	y=250
	i=0
	bordercreation=1
	turtle.setx((0))
	turtle.sety(0)
	turtle.pendown()
	trapped=False
	Matrix = [[0 for ax in range(500)] for ay in range(500)]
	for border in range (0,500):
		Matrix[bordercreation,1]=3
		Matrix[bordercreation,500]=3
		Matrix[0,bordercreation]=3
		Matrix[500,bordercreation]=3
		bordercreation=bordercreation+1
	while nomove==False:
		Matrix[250][250]=True
		xory = random.choice([True,False])
		porm = random.choice([-1,1])
		Matrix2=Matrix
		if xory==True:
			if (Matrix[x+porm][y]==0):
				x =x+ porm
				Matrix[x][y]=1
		if xory==False:
			if (Matrix[x][y+porm]==0):
				y =y+ porm
				Matrix[x][y]=1
				i += 1
				turtle.setx((x-250)*5)
				turtle.sety((y-250)*5)
		turtle.setx((x-250)*5)
		turtle.sety((y-250)*5)
		if (Matrix[x][y+1]==1 and Matrix[x][y-1]==1 and Matrix[x+1][y]==1 and Matrix[x-1][y]==1):
			nomove=True
			#print(i)
			avr += i
			turtle.penup()
			turtle.clear()
	nomove=False;
print (avr)
turtle.done()

