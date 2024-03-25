import customtkinter as ctk
import tkinter as tk

ctk.set_appearance_mode("light")
ctk.set_default_color_theme("green")

class App(ctk.CTk):
    def __init__(self, *args,**kwargs) :
        super().__init__(*args,**kwargs)
        
        self.title("SIP Calculator")
        self.geometry("700x400")
        self.openingLabel = ctk.CTkLabel(self,text="SIP CALCULATOR", font = ("Times New Roman",20))
        self.openingLabel.pack(pady = 20)

        self.tenure = ctk.CTkLabel(self,text = "Tenure (in years) -> ")
        self.tenure.grid(row=0, column=0,padx=20, pady=20,sticky="ew")
    
if __name__ =="__main__":
    app = App()
    app.mainloop()