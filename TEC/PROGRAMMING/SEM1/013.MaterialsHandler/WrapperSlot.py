import sys
import DBOps
from PyQt4 import QtCore, QtGui, uic

#QU ehice
#como
#que se uso
#para que sirvej

qtCreatorFile = "TestGUI.ui" # Enter file here.
 
fbdb = DBOps.getdb()
Ui_MainWindow, QtBaseClass = uic.loadUiType(qtCreatorFile)


class MyApp(QtGui.QMainWindow, Ui_MainWindow):

    def __init__(self):
        QtGui.QMainWindow.__init__(self)
        Ui_MainWindow.__init__(self)
        self.setupUi(self)
        self.pushButton.clicked.connect(self.begindbops)
        self.pushButton.clicked.connect(self.clearfields)

    def clearfields(self):
        self.lineEdit.clear()
        self.lineEdit_2.clear()

    def begindbops(self):
        name = str(self.lineEdit.text()).upper()
        matricle = str(self.lineEdit_2.text()).upper()
        operation = self.comboBox_2.currentText()
        material = self.comboBox.currentText()
        if operation == "Prestamo":
           DBOps.modAvail(material, -1, fbdb)
           DBOps.loaner(name, matricle, material, fbdb)
        elif operation == "Devolucion":
           DBOps.modAvail(material, 1, fbdb)
           DBOps.returner(name, matricle, material, fbdb)


if __name__ == "__main__":
    app = QtGui.QApplication(sys.argv)
    window = MyApp()
    window.show()
    sys.exit(app.exec_())
