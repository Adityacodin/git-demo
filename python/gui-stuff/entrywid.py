from tkinter import *
import customtkinter

customtkinter.set_appearance_mode("dark")
customtkinter.set_default_color_theme("dark-blue")

root = customtkinter.CTk();

root.title("enter your name: ")
root.geometry('600x350')

MYlabel = customtkinter.CTkLabel(root,text ="",font = ('Helvetica',25))
MYlabel.pack(pady=40)

myEntry = customtkinter.CTkEntry(root
,placeholder_text="Enter Your Name")
myEntry.pack(pady=20)

def submit():
    MYlabel.configure(text=f"Hello {myEntry.get().title()}")
myBut = customtkinter.CTkButton(root,text = "Submit",command= submit)
myBut.pack(pady=10)
root.mainloop()