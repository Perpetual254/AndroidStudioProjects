package com.example.perpetual

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.perpetual.ui.theme.PerpetualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Safaris()
         // work()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Safaris(){

    val home = LocalContext.current

    LazyColumn (
              modifier = Modifier
                  .background(Color.Black)
                  .fillMaxSize(),
              horizontalAlignment = Alignment.CenterHorizontally,
              verticalArrangement = Arrangement.SpaceEvenly


    ){
        item {

            Column{

                Text(
                    text = "WELCOME TO EMOBILIS",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 20.sp,
                    color = Color.Red

                )

                Spacer(
                    modifier =Modifier
                        .height(100.dp)
                )

                Button(
                    onClick = { home.startActivity(Intent(home,LoginActivity::class.java))},
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(20.dp)

                ) {

                    Text(text = "LOGIN")
                }

                Text(
                    text = "hgbvnxccccccccc"
                )


                AsyncImage(
                    model = "https://www.emobilis.ac.ke/images/logo.jpg",
                    contentDescription = null,
                )





            }


        }
    }



}

// this is how to create input fields where as in jetpack
// it is known as text fields
//@Composable
//fun work (){
//
//   var age by remember {
//           mutableStateOf(TextFieldValue(""))
//   }
//
//   var name by remember {
//      mutableStateOf(TextFieldValue(""))
//    }
//
//    LazyColumn (
//              modifier = Modifier
//                  .background(Color.Black)
//                  .fillMaxSize()
//    ){
//        item {
//
//            Column {
//                OutlinedTextField(
//                    value = name,
//                    colors = OutlinedTextFieldDefaults.colors(
//                        unfocusedBorderColor = Color.Blue,
//                        focusedBorderColor = Color.Red,
//                        focusedLabelColor = Color.Red
//                    ),
//                    onValueChange = {name=it},
//                    label = { Text(text = "name")}
//                )
//
//                Spacer(modifier = Modifier.height(5.dp))
//
//
//                OutlinedTextField(
//                    value =age ,
//                    colors = OutlinedTextFieldDefaults.colors(
//                        unfocusedBorderColor = Color.Green,
//                        focusedBorderColor = Color.Red,
//                        focusedLabelColor = Color.Red
//                    ),
//                    onValueChange = {age = it},
//                    label = { Text(text = "age")},
//                    visualTransformation = PasswordVisualTransformation()
//                )
//
//
//            }
//
//        }
//    }
//
//
//
//
//
//
//
//////in order to create a lazy layout you have to have an item and it must contain one thing
//}
//









