import sys
import DBOps
from PyQt4 import QtCore, QtGui, uic
 
qtCreatorFile = "GUI.ui" # Enter file here.
 
Ui_MainWindow, QtBaseClass = uic.loadUiType(qtCreatorFile)
 
class MyApp(QtGui.QMainWindow, Ui_MainWindow):
    def __init__(self):
        QtGui.QMainWindow.__init__(self)
        Ui_MainWindow.__init__(self)
        self.setupUi(self)
        self.pushButton.clicked.connect(self.begindbops)
    def begindbops(self):
        name = self.lineEdit.toPlainText()
        matricle = self.lineEdit_2.toPlainText()
        operation = self.comboBox_2.currentText()
        material = self.comboBox.currentText()
        if operation == "Prestamo":
           DBOps.modAvail(material, -1)
           DBOps.loaner(name, matricle, material)
        elif operation == "Devolucion":
           DBOps.modAvail(material, 1)
           DBOps.returner(name, matricle, material)



        

 
if __name__ == "__main__":
    app = QtGui.QApplication(sys.argv)
    window = MyApp()
    window.show()
    sys.exit(app.exec_())
