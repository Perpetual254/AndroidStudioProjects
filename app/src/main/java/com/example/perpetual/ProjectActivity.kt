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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.perpetual.ui.theme.PerpetualTheme

class ProjectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             content()

        }
    }
}



@Preview(showBackground = true)
@Composable
fun content(){

    
    var weak by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column (
          modifier = Modifier
             // .size(2.dp)
              .background(Color.Red),

            //  .clip(RoundedCornerShape(100.dp)),
          horizontalAlignment = Alignment.Start


        //  horizontalAlignment = Alignment.CenterHorizontally,


    ) {

        Text(
            text = "Location",

        )

        Spacer(
            modifier = Modifier
                .height(2.dp)
        )

        Text(
            text ="New York , USA",
            color = Color.White

        )

        Spacer(
            modifier = Modifier
                .height(3.dp)
        )

        Row {

            OutlinedTextField(
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp),
                leadingIcon = {
                    Icon(Icons.Filled.Search, contentDescription ="search")
                },
                trailingIcon = {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = null)
                },
                value = weak,
                onValueChange = {weak=it},


//                Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification icon")
            )


        }



        Spacer(
            modifier = Modifier
                .height(3.dp)
        )

        Text(
            text ="#SpecialForYou",
             color = Color.White
        )


        LazyRow (
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(40.dp))
                    .padding(4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
        ){

             item {

                 Row {
                     

                     Spacer(
                         modifier = Modifier
                             .height(8.dp)
                     )
                     
                     Image(
                         modifier = Modifier
                             .padding(4.dp)
                         ,
                         painter = painterResource(id = R.drawable.sales),
                         contentDescription = ""
                     )


                     Image(
                         modifier = Modifier
                             .padding(4.dp)
                         ,
                         painter = painterResource(id = R.drawable.sales),
                         contentDescription = null 
                     )
                     
                     Image(
                         modifier = Modifier
                             .padding(4.dp)
                         ,
                         painter = painterResource(id = R.drawable.sales),
                         contentDescription = null
                     )
                     
                     
                     
                     
                 }
             }
        }

         Spacer(
             modifier =Modifier
                 .height(10.dp)

         )

         Text(
             text ="Category",
              color = Color.White
         )

         LazyRow (
                 modifier = Modifier
                     .background(Color.White)
                     .fillMaxWidth(),
                 horizontalArrangement = Arrangement.SpaceBetween
         ){

             item {

                 Row {

                    Image(
                        modifier = Modifier
                            .padding(4.dp)
                        ,
                        painter = painterResource(id = R.drawable.walk) ,
                        contentDescription = ""
                    )

                    Image(
                        modifier = Modifier
                            .padding(4.dp)
                        ,
                        painter = painterResource(id = R.drawable.clothe),
                        contentDescription = ""
                            
                    )

                    Image(
                        modifier = Modifier
                            .padding(4.dp)
                        ,
                        painter = painterResource(id = R.drawable.working) ,
                        contentDescription =""
                    )

                    Image(
                        modifier = Modifier
                            .padding(4.dp)
                        ,
                        painter = painterResource(id = R.drawable.watch),
                        contentDescription = ""
                    )

                 }

             }
         }


    }

}










