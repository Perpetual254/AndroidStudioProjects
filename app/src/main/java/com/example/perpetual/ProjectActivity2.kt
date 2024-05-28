package com.example.perpetual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.perpetual.ui.theme.PerpetualTheme

class ProjectActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           project()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun project(){
  
   LazyColumn (
          modifier = Modifier
              .background(Color.LightGray)
              .fillMaxSize(),
          horizontalAlignment = Alignment.CenterHorizontally

   ){
       
       item {

           Column (
                  modifier = Modifier
                      .background(Color.White)
                      .clip(RectangleShape)
           ){
               
              
               
               Row(
                   modifier = Modifier
                       .fillMaxWidth(),
                   horizontalArrangement = Arrangement.SpaceEvenly

               ) {

                   Text(
                       text = "Product Details"
                   )
                   

                   Icon(
                       imageVector = Icons.Default.FavoriteBorder,
                       contentDescription = "Favourite icon"
                   )
                   
               }
               

                   
           Image(
                  modifier = Modifier
                      .align(Alignment.CenterHorizontally)
                      .size(400.dp)

                           //  .height(50.dp)
                       ,
                       painter = painterResource(id = R.drawable.sales) ,
                       contentDescription =""
           )




           Text(
                      text = "Clothes"
           )

           Spacer(
                      modifier = Modifier
                          .height(8.dp)
           )
           Text(
                       text = "Light Brown Coat"
           )

           Spacer(
                       modifier = Modifier
                       .height(4.dp)
           )

           Text(
                       text = "Seller"
           )

           Row {

                Image(
                      modifier = Modifier
                           .clip(RoundedCornerShape(200.dp))

                           ,

                      painter = painterResource(id = R.drawable.done),
                      contentDescription = ""
                )

                Text(
                    text = "Jenny Doe"
                )

                Icon(
                    imageVector = Icons.Default.MailOutline,
                    contentDescription = "Mailicon"
                )

                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription =""
                )

           }





           }


       }
       
   } 
    
    
   
    
}