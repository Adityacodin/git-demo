import customtkinter as ctk
import tkinter as tk
import math
import matplotlib.pyplot as plt 
import numpy as np
from PIL import Image

ctk.set_appearance_mode("bright")
# ctk.set_default_color_theme("green")

class App(ctk.CTk):
    


    def __init__(self,*args,**kwargs):
        super().__init__(*args,**kwargs)

        def dispPie(self,M,N):
            names = ['Invested Amount\n('+str(format(N,',d'))+')','Maturity Value\n('+str(format(M,',d'))+')'] 
            pi = np.array([N,M])
            fig = plt.figure(figsize=(5,5))

            plt.pie(pi,labels= names)
            plt.show()

        def Display(self,M,N):
            self.MatDisp.configure(text=str(format(M,',d')))
            self.AmtDisp.configure(text=str(format(N,',d')))
            self.Details = ctk.CTkButton(master=self,text='Details',fg_color = '#E74C3C',border_color='#02b165',hover_color="#C0392B",command = lambda: dispPie(self,M,N))
            self.Details.grid(row = 4, column = 2, padx = 20, pady = 20, sticky= 'ew')
            # dispPie(self,M,N)

        
            

        def getSip(self,amt,te,pe) :
            P = amt
            i = float(pe/12)
            n = te*12

            M = int(P * ((pow((1+i),n)-1)/i) * (1+i))
            N = int(amt*n)
            print(M,N)
            Display(self,M,N)

        def getLump(self,lsamt,te,pe):
            P=lsamt
            M = math.ceil(P*(pow(1+pe,te)))
            print(M,P)
            Display(self,M,P)

        def pressedCalculate():
            global tenure
            tenure = int(self.ten.get())

            global per
            per = float(int(self.roi.get())/100)

            global amount
            if self.Amt.get() != '':
                amount = int(self.Amt.get())
                getSip(self,amount,tenure,per)
            elif self.ls.get() != '':
                lsamount = int(self.ls.get())
                getLump(self, lsamount, tenure, per)

            

        
            
            
        # print(amount)
        def pressedReset():
            self.Amt.delete(0,'end')
            # self.ten.delete(0,'end')
            self.ls.delete(0,'end')
            self.roi.delete(0,'end')
            self.MatDisp.configure(text="")
            self.AmtDisp.configure(text="")
            


        self.title("SIP Calculator")
        self.geometry('700x500')

        self.IMGFrame =ctk.CTkFrame(self,fg_color='dark gray')
        self.IMGFrame.grid(row=0,column=0,sticky='ew')

        self.InputFrame = ctk.CTkFrame(master = self,fg_color='#F5B7B1')
        self.InputFrame.grid(row =0,column=2,sticky='ew')

        self.my_img = ctk.CTkImage(light_image=Image.open('C:/Users/33333333333333333333/gitdemo/gitemo/python/gui-stuff/image.jpg'),size=(200,400))
        self.label = ctk.CTkLabel(master=self.IMGFrame,text='',image=self.my_img)
        self.label.grid()

        self.SIPamt = ctk.CTkLabel(master=self.InputFrame,text = 'SIP Amount  ')
        self.SIPamt.grid(row = 0, column = 0, padx = 20, pady = 20, sticky = 'ew')

        self.Amt = ctk.CTkEntry(master=self.InputFrame,placeholder_text = '2000',border_color="#E74C3C")
        self.Amt.grid(row = 0, column = 1, padx = 20, pady = 20, sticky = 'ew')
        

        self.Tenure = ctk.CTkLabel(master=self.InputFrame, text = "Tenure (in years) ")
        self.Tenure.grid(row = 1, column = 0, padx = 20, pady = 20,sticky = 'ew')

        self.ten = ctk.CTkComboBox(master=self.InputFrame,values = ['5','10','15','20','25','30','35'],border_color="#E74C3C",button_color="#E74C3C",dropdown_hover_color="#02b165")
        self.ten.grid(row = 1, column = 1, padx = 20, pady = 20, sticky = 'ew')

        self.ror = ctk.CTkLabel(master=self.InputFrame, text = 'Rate of Return (%) ')
        self.ror.grid(row = 2, column = 0, padx = 20, pady = 20,sticky = 'ew')

        self.roi = ctk.CTkEntry(master=self.InputFrame, placeholder_text= '12%',border_color="#E74C3C")
        self.roi.grid(row = 2, column = 1, padx = 20, pady = 20, sticky = 'ew')


        self.lumpSum = ctk.CTkLabel(master=self.InputFrame,text='Lump-sum Amount  ')
        self.lumpSum.grid(row = 3, column = 0, padx = 20, pady = 20, sticky = 'ew')

        self.ls = ctk.CTkEntry(master=self.InputFrame, placeholder_text = '1,00,000',border_color="#E74C3C")
        self.ls.grid(row = 3, column = 1, padx = 20, pady = 20, sticky = 'ew')

        self.Output = ctk.CTkFrame(master=self,fg_color='#E74C3C')
        self.Output.grid(row=1,column=2,sticky='ew')

        self.InvAmt = ctk.CTkLabel(master=self.Output,text ="Invested Amount")
        self.InvAmt.grid(row = 5, column = 0, padx = 20, pady = 20, sticky = 'ew')

        self.AmtDisp = ctk.CTkLabel(master=self.Output,text='')
        self.AmtDisp.grid(row = 5, column = 1, padx=20, pady = 20, sticky = 'ew')

        self.MatVal = ctk.CTkLabel(master=self.Output,text='Maturity Value   ')
        self.MatVal.grid(row = 6, column = 0,padx = 10,pady = 20, sticky = 'ew')

        self.MatDisp = ctk.CTkLabel(master=self.Output,text='')
        self.MatDisp.grid(row = 6, column = 1, padx = 20,pady =20, sticky = 'ew')

        # self =  ctk.CTkFrame(master=self,fg_color='#E74C3C')
        # self.grid(row=2 ,column=0,columnspan=2,sticky='ew')

        self.Calculate = ctk.CTkButton(master=self,text="Calculate",fg_color="#E74C3C",border_color="black",hover_color="#C0392B", command = pressedCalculate)
        self.Calculate.grid(row = 4, column = 0, padx = 20, pady = 20 ,sticky = 'ew')

        self.Reset = ctk.CTkButton(master=self,text="Reset",fg_color="#E74C3C",border_color="black",hover_color="#C0392B",command = pressedReset)
        self.Reset.grid(row = 4,column = 1, padx =20, pady = 20, sticky = 'ew')

        

if __name__=="__main__":
    app = App()
    app.mainloop()