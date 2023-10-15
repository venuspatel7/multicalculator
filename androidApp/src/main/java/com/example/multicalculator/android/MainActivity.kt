package com.example.multicalculator.android
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CalcView()
                }
            }
        }
    }
}



@Preview
@Composable
fun CalcView() {
    val display = remember { mutableStateOf("0") }

    Column(
        modifier = Modifier.background(Color.LightGray))
    {
        Row {
                CalcDisplay(display)
        }
        Row {
            Column {
                for (i in 7 downTo 1 step 3) {
                    CalcRow(display, i, 3)
                }
                Row {
                    CalcNumericButton(0, display)
                    CalcEqualsButton(display)

                }
            }

            Column {
                CalcOperationButton("+", display)
                CalcOperationButton("-", display)
                CalcOperationButton("*", display)
                CalcOperationButton("/", display)
            }
        }
    }
}

@Composable
fun CalcRow(display: MutableState<String>, startNum: Int, numButtons: Int) {
    val endNum = startNum + numButtons
    Row(modifier = Modifier.padding(0.dp)) {
        for (i in startNum until endNum) {
            CalcNumericButton(i, display)
        }
    }
}


@Composable
fun CalcDisplay(display: MutableState<String>) {
    Text(
        text = display.value,
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .padding(5.dp),
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun CalcNumericButton(number: Int, display: MutableState<String>) {
    Button(
        onClick = { display.value += number.toString() },
        modifier = Modifier.padding(4.dp)
    ) {
        Text(text = number.toString())
    }
}

@Composable
fun CalcOperationButton(operation: String, display: MutableState<String>) {
    Button(onClick = {}, modifier = Modifier.padding(4.dp)) {
        Text(text = operation)
    }
}

@Composable
fun CalcEqualsButton(display: MutableState<String>) {
    Button(
        onClick = { display.value = "0" },
        modifier = Modifier.padding(4.dp)
    ) {
        Text(text = "=")
    }
}

