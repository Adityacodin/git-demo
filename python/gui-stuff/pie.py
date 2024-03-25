import customtkinter
import matplotlib.pyplot as plt

class PieChartApp(customtkinter.CTk):
    def __init__(self):
        super().__init__()

        # Create a pie chart figure
        self.fig, self.ax = plt.subplots()

        # Add pie chart data
        self.ax.pie([10, 20, 30, 40], labels=['A', 'B', 'C', 'D'])

        # Create a canvas to display the pie chart
        self.canvas = customtkinter.CTkCanvas(self)
        self.canvas.pack(fill=customtkinter.BOTH, expand=True)

        # Embed the pie chart figure in the canvas
        self.fig_tk = customtkinter.FigureCanvasTkAgg(self.fig, master=self.canvas)
        self.fig_tk.draw()

        # Add a title to the pie chart
        self.ax.set_title('Pie Chart')

        # Display the pie chart
        self.canvas.get_tk_widget().pack()

if __name__ == '__main__':
    app = PieChartApp()
    app.mainloop()