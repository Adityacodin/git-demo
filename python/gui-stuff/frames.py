import customtkinter as ctk 
import tkinter as tk

ctk.set_appearance_mode('bright')
ctk.set_default_color_theme('blue')
class App(ctk.CTk):
    def __init__(self,*args,**kwargs):
        super().__init__(*args,**kwargs)
        self.title("Frame")
        self.geometry('600x400')
        self.resizable(width=True,height=True)

        # frame1
        self.Input = ctk.CTkFrame(master=self,fg_color='light gray')
        self.Input.pack(expand=True,fill='both')

        self.Output = ctk.CTkFrame(master=self.Input,fg_color='dark gray')
        self.Output.pack(expanside='bottom',fill='x')

        self.display = ctk.CTkFrame(master=self,fg_color='white')
        self.display.pack(side='right',fill='y')

        
        


if __name__=="__main__":
    app = App()
    app.mainloop()