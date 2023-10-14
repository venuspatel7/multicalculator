package com.example.multicalculator.android
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multicalculator.Greeting
import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingView(Greeting().greet())
                }
            }
        }
    }
}
@Composable
fun CalcView()
{
    val displayText by mutableStateOf("0")
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {

        }
        Row(modifier = Modifier.fillMaxWidth()) {
          Column {

          }
           Column {

           }
        }
    }

}
@Composable
fun CalcRow(display: MutableState<String>, starNum:Int, numButton: Int )
{
    val endNum = startNum + numButtons
    Row(modifier = Modifier.padding(0.dp)) {
        for (i in startNum until endNum) {
            CalcNumericButton(i, display)
        }
    }

}
@Composable
fun CalcDisplay(display: MutableState<String>)
{

}
fun CalcNumericButton(number: Int, display: MutableState<String>)
{
        Button
}
@Composable
fun CalcOperationButton( operation: String, display: MutableState<String>)
{
    Button(onClick = "", modifier = Modifier.padding(4.dp))

}


@Composable
fun CalcEqualsButton(display: MutableState<String>) {
    Button(
        onClick = { displayValue = "0" },
        modifier = Modifier.padding(4.dp)
    )
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
