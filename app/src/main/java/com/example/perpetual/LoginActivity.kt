package com.example.perpetual

import android.content.Intent
import android.graphics.drawable.Icon
import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.perpetual.ui.theme.PerpetualTheme
import kotlin.math.round

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             new()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun new (){

     val kick = LocalContext.current

     val  drop = LocalContext.current

     var username by remember {
         mutableStateOf(TextFieldValue(""))
     }

     var password by remember {
         mutableStateOf(TextFieldValue(""))
     }



    Column (
             modifier = Modifier
                 .background(Color(0xff143c04))
                 .fillMaxSize(),
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.Center

    ) {

        Image(
               modifier = Modifier
                   .clip(RoundedCornerShape(20.dp))
            ,
            painter = painterResource(id = R.drawable.logo) ,
            contentDescription = ""
        )

      Spacer(
          modifier = Modifier
              .height(6.dp)
      )


      Text(
          text = "LOGIN",
            fontSize = 30.sp
      )

       Spacer(
           modifier = Modifier
               .height(8.dp)
       )


       Text(
           text = "Come back with your ID ",
            fontSize = 20.sp
       )

       Spacer(
           modifier = Modifier
               .height(4.dp)
       )

       Text(
           text = "For easy, fast and secure login",
            fontSize = 6.sp
       )

       Spacer(
           modifier = Modifier
               .height(6.dp)
       )



       OutlinedTextField(
                 modifier = Modifier,
                   shape = RoundedCornerShape(20.dp),
                   leadingIcon = {
                     Icon(Icons.Filled.Person, contentDescription = "person" )
                   },
           value = username,
           onValueChange = {username=it}

         //  Icon(Icons.Filled.Person,contentDescription = "person")

        )

       Spacer(
           modifier = Modifier
               .height(8.dp)
       )



       OutlinedTextField(
                 modifier = Modifier,
                   shape = RoundedCornerShape(20.dp),
                   leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "lock" )
                   },
           value = password,
           onValueChange = { password = it},

       )

       Spacer(
           modifier =Modifier
            .height(6.dp)
       )



       Button(
           onClick = { /*TODO*/ },
           colors = ButtonDefaults.buttonColors(Color.Blue)
       ) {
           Text(text = "LOGIN")
       }

       Text(
           text = "Forgot password ?",
            modifier = Modifier.clickable { kick.startActivity(Intent(kick,LoginActivity::class.java)) }

       )

       Spacer(
           modifier = Modifier
               .height(4.dp)
       )

       Text(
           text = "OR",
           fontSize = 80.sp
       )

       Spacer(
           modifier = Modifier
               .height(4.dp)
       )

       Text(
           text = "Not a member ? SIGN UP",
           modifier = Modifier.clickable { drop.startActivity(Intent(drop,LoginActivity::class.java)) }
       )





    }








}
