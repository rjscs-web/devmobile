package com.example.inferno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(16.dp)) {
                MessageCard(
                    Message("Esnupi", "Aprendendo a programar", R.drawable.esnupi)
                )
                Spacer(modifier = Modifier.height(16.dp))
                
                MessageCard(
                    Message("Snoopy", "É fácil!", R.drawable.snoopy1)
                )

                Spacer(modifier = Modifier.height(16.dp))

                MessageCard(
                    Message("Cachorro burro", "É tão dificil!", R.drawable.norgget)
                )
            }
        }
    }
}

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {

        Image(
            painter = painterResource(msg.image),
            contentDescription = "Foto",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {

    Column(modifier = Modifier.padding(16.dp)) {

        MessageCard(
            Message("Esnupi", "Aprendendo a programar", R.drawable.esnupi)
        )

        Spacer(modifier = Modifier.height(16.dp))

        MessageCard(
            Message("Snoopy", "É tão fácil!", R.drawable.snoopy1.jpg
        )

        Spacer(modifier = Modifier.height(16.dp))

        MessageCard(
            Message("Cachorro burro", "É tão  dificil!", R.drawable.norgget)
        )
    }
}
