package com.example.final2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d : Double = 0.0

        del.setOnClickListener {
            if (textView3.text == "0" || textView3.text.length.toString() == "1") {
                textView3.setText("0")
            } else {
                textView3.setText(textView3.text.toString().dropLast(1))
            }
        }

        clear.setOnClickListener {
            textView3.setText("0")
        }
        button7.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "7")
            } else {
                textView3.setText(textView3.text.toString() + "7")
            }
        }
        button8.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "8")
            } else {
                textView3.setText(textView3.text.toString() + "8")
            }
        }
        button9.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "9")
            } else {
                textView3.setText(textView3.text.toString() + "9")
            }
        }
        button4.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "4")
            } else {
                textView3.setText(textView3.text.toString() + "4")
            }
        }
        button5.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "5")
            } else {
                textView3.setText(textView3.text.toString() + "5")
            }
        }
        button6.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "6")
            } else {
                textView3.setText(textView3.text.toString() + "6")
            }
        }
        button1.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "1")
            } else {
                textView3.setText(textView3.text.toString() + "1")
            }
        }
        button2.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "2")
            } else {
                textView3.setText(textView3.text.toString() + "2")
            }
        }
        button3.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "3")
            } else {
                textView3.setText(textView3.text.toString() + "3")
            }
        }
        button0.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("0")
            } else {
                textView3.setText(textView3.text.toString() + "0")
            }
        }

        divide.setOnClickListener {
            c = "/"
            a = textView3.text.toString()
            textView3.setText("0")
        }
        multiply.setOnClickListener {
            c = "*"
            a = textView3.text.toString()
            textView3.setText("0")
        }
        delete.setOnClickListener {
            c = "-"
            a = textView3.text.toString()
            textView3.setText("0")
        }
        plus.setOnClickListener {
            c = "+"
            a = textView3.text.toString()
            textView3.setText("0")
        }
        mod.setOnClickListener {
            c = "%"
            a = textView3.text.toString()
            textView3.setText("0")
        }
        equalto.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / textView3.text.toString().toDouble())
                textView3.setText(d.toString())
            } else if (c == "*") {
                d = (a.toString().toDouble() * textView3.text.toString().toDouble())
                textView3.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - textView3.text.toString().toDouble())
                textView3.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + textView3.text.toString().toDouble())
                textView3.setText(d.toString())
            }else if (c == "%") {
                d = (a.toString().toDouble() % textView3.text.toString().toDouble())
                textView3.setText(d.toString())
            }
        }
        point.setOnClickListener {
            if (!textView3.text.toString().contains(".")) {
                textView3.text = textView3.text.toString() + "."
            }
        }

    }
}