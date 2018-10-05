from tkinter import *
from tkinter import ttk

root = Tk()
root.title("MaterialHandler")
mainframe = ttk.Frame(root, padding="3 3 12 12")
mainframe.grid(column=0, row=0, sticky=(N, W, E, S))
mainframe.columnconfigure(0, weight=10)
mainframe.rowconfigure(0, weight=10)

name = StringVar()
matricle = StringVar()
material = StringVar()

ttk.Label(mainframe, text="Student's name").grid(column=1, row=1, sticky=(W, E))
name_entry = ttk.Entry(mainframe, width = 55, textvariable = name)
name_entry.grid(column=2, row=1, sticky=(W, E))
ttk.Label(mainframe, text="Matricle:").grid(column=1, row=2, sticky=(W, E))
mat_entry = ttk.Entry(mainframe, width = 55, textvariable = matricle)
mat_entry.grid(column=2, row=2, sticky=(W, E))
ttk.Label(mainframe, text="Equipment:").grid(column=3, row=1, sticky=(W, E))
matbox = ttk.Combobox(mainframe, state = "readonly", textvariable = material, value =('OCULUS', 'VIVE', 'ECHO')).grid(column=3, row=2, sticky=(W, E))
submitb = ttk.Button(mainframe, text = "Submit").grid(column = 2, row = 5)

submitb.bind('<Button-1>', test)
root.mainloop()

