from tkinter import *
import customtkinter

# set the theme and collor options
customtkinter.set_appearance_mode("Dark")
customtkinter.set_default_color_theme("dark-blue")

root = customtkinter.CTk()

root.title('CUSTOM TKINTER TUTORIAL')
root.geometry('600x600')

def hello():
    my_label.configure(text = "project work initiated")

my_button = customtkinter.CTkButton(root, 
text = "hello world",
command = hello,
height = 80,
width = 80,
font = ("Helvetica",25),
hover_color="green",
corner_radius = 50,
border_color="white",
border_width = 10,
state = "normal") #remains red when not hovered
my_button.pack(pady = 80)

my_label = customtkinter.CTkLabel(root,text= "")
my_label.pack(pady=80)

root.mainloop()