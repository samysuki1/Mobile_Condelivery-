package br.com.fiap.mobilecondelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.mobilecondelivery.ui.theme.MobileCondeliveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileCondeliveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MobileCondeliveryScreen()
                }
            }
        }
    }
}

@Composable
fun MobileCondeliveryScreen() {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                // ---- header ---------
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(190.dp)
                        .background(colorResource(id = R.color.red_condelivery))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logoemalta),
                        contentDescription = "Imagem do logo Condelivery"
                    )
                }
                // --- formulário
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .offset(y = (-25).dp)
                            .fillMaxWidth()
                            .height(400.dp),
                        colors = CardDefaults
                            .cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(4.dp),
                        border = BorderStroke(width = 1.dp, Color.Red)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier
                                .background(colorResource(id = R.color.amarelo_condelivery))
                                .fillMaxWidth()
                                .fillMaxHeight()
                        ) {
                            Text(
                                text = "Conectando, Simplificando, Entregando!",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                                border = BorderStroke(width = 3.dp, Color.White)
                            ) {
                                Text(text = "Restaurantes")
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                                border = BorderStroke(width = 3.dp, Color.White)
                            ) {
                                Text(text = "Shopping")
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                                border = BorderStroke(width = 3.dp, Color.White)
                            ) {
                                Text(text = "Promoções")
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                                border = BorderStroke(width = 3.dp, Color.White)
                            ) {
                                Text(text = "Jogos Online")
                            }
                        }
                    }
                }
            }

            // -- Card Resultado
            Card(
                modifier = Modifier
                    .offset(y = (580).dp, x = (90).dp)
                    .height(220.dp),
                colors = CardDefaults
                    .cardColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.condelivery),
                    contentDescription = "Imagem dos Prédios com Hérois"
                )

            }


        }

    }


