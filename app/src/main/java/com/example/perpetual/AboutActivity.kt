package com.example.perpetual

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.perpetual.ui.theme.PerpetualTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          // About()
           create()
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun About(){
//
//    Column (
//        modifier = Modifier
//            .background(Color.Green)
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceEvenly
//           // .padding(10.dp)
//
//
//    )  {
//
//        Text(
//            "this is a new screen ",
//            fontSize = 15.sp,
//            color = Color.Blue,
//            fontFamily = FontFamily.Cursive
//        )
//
//        Spacer(
//            modifier = Modifier
//                .height(12.dp)
////           in here the spacer is used to leave space btwn diff. texts
//        )
//
//        Text(
//            text = "safari lab",
//            fontStyle = FontStyle.Italic,
//            fontWeight = FontWeight.Bold,
//            color=Color(0xff2FBFBU),
//        )
//
//
//        Spacer(
//            modifier = Modifier
//                .height(12.dp)
////           in here the spacer is used to leave space between diff. texts
//        )
//
//
//        Text(
//            text = "Welcome to school",
//            color=Color(0xff2FBFBU),
////          This is how to add a custom color to your codes
////         The 0xff code is mandatory then without spacing the code of the color
//       )
//
//        Button(
//            onClick = { /*TODO*/ },
//            colors = ButtonDefaults.buttonColors(Color.Blue),
//            shape = RoundedCornerShape(20.dp)
//
//        ) {
//
//            Text(text = "SERVICES")
//
//        }
//
////        this is how you add an image
////        in this the painter resource fetches the data from resource which gets from the drawables
////         as we style the images in images we use clips as a way styling the shape
//        Image(
//             modifier = Modifier
//                 .clip(RoundedCornerShape(10.dp))
//                 .border(3.dp, Color.Red)
//                 ,
//            painter = painterResource(id =R.drawable.home ),
//            contentDescription = null)
//
//
//    }
//
//}

@Preview(showBackground = true)
@Composable
fun create (){
    

    Column (
          modifier = Modifier
              .background(Color.White)
              .fillMaxSize(),
         // horizontalArrangement = Arrangement.SpaceEvenly,
         // verticalAlignment = Alignment.CenterVertically


    ){

         Text(
             text = "SERVICES OFFERED",
                color = Color.Black,


         )

    Row {
        

        
        Image(
                modifier = Modifier
                    .height(200.dp)
                    .width(150.dp)
                    .border(2.dp, Color.Blue)
                    .clip(RoundedCornerShape(55.dp))
                  //  .padding(end = 20.dp)
                  //  .padding(top = 50.dp)
            ,
            painter = painterResource(id = R.drawable.android), 
            contentDescription =null )
        
        
        Image(
               modifier = Modifier
                   .height(200.dp)
                   .width(150.dp)
                   .border(2.dp, Color.Blue)
                   .clip(RoundedCornerShape(55.dp))
            ,
            painter = painterResource(id = R.drawable.fullstack),
            contentDescription ="" )
        

        
    }   
        
        
       



    }

}







