import customtkinter as ctk 
import tkinter as tk 

ctk.set_default_color_theme("blue")
ctk.set_appearance_mode("light")



class App(ctk.CTk):
    def __init__(self,*args,**kwargs):
        super().__init__(*args,**kwargs)

        self.title("Bake-Book (Login)")
        self.geometry("400x400")
        self.resizable(width = True, height = True)

        self.username = ctk.CTkEntry(self,placeholder_text="Username")
        self.username.pack(side = "top",pady = 20)

        self.password = ctk.CTkEntry(self,placeholder_text="Password")
        self.password.pack(side = "top")

        self.Login = ctk.CTkButton(self,text = "Login")
        self.Login.pack(side='top', pady = 20)

        self.RegisterButton = ctk.CTkButton(self,text = "Register")
        self.RegisterButton.pack(side = 'top')


if __name__=="__main__":
    app = App()
    app.mainloop()
