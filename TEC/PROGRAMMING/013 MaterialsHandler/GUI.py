from tkinter import *
from tkinter import ttk
root = Tk()
root.title("MaterialHandler")
mainframe = ttk.Frame(root, padding="3 3 12 12")
mainframe.grid(column=0, row=0, sticky=(N, W, E, S))
mainframe.columnconfigure(0, weight=10)
mainframe.rowconfigure(0, weight=10)

name = StringVar()
matricula = StringVar()
ttk.Label(mainframe, text="Nombre del Alumno:").grid(column=1, row=1, sticky=(W, E))
name_entry = ttk.Entry(mainframe, width = 55, textvariable = name)
name_entry.grid(column=1, row=1, sticky=(W, E))
ttk.Label(mainframe, text="Matrícula:").grid(column=1, row=2, sticky=(W, E))
mat_entry = ttk.Entry(mainframe, width = 55, textvariable = matricula)
mat_entry.grid(column=1, row=2, sticky=(W, E))
root.mainloop()
