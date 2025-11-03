from PyQt6.QtWidgets import (
    QApplication, QMainWindow, QLabel, QPushButton, QVBoxLayout, QWidget, QLineEdit, QGridLayout
)
from PyQt6.QtCore import Qt
import sys

class Window(QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Practice PyQt6")
        self.setGeometry(100, 100, 400, 300)

        layout = QGridLayout()
        self.setLayout(layout)

        label = QLabel("Hello World", self)
        layout.addWidget(label, 0, 0, 1, 1)

        button = QPushButton("Click Me", self)
        button.clicked.connect(self.clicked)
        layout.addWidget(button, 1, 0, 1, 1)

        self.text = QLineEdit(self)
        layout.addWidget(self.text, 2, 0, 1, 1)

    def clicked(self):
        print("Button Clicked")
        self.text.setText("Button Clicked")

app = QApplication(sys.argv)
window = Window()
window.show()
app.exec()