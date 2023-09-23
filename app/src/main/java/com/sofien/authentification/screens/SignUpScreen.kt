package com.sofien.authentification.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sofien.authentification.R
import com.sofien.authentification.components.NormalTextComponent
import com.sofien.authentification.components.HeadingTextComponent
import com.sofien.authentification.components.MyTextField

@Composable
fun SignUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ) {
        Column (modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value= stringResource(id = R.string.create_account))
            MyTextField("Full name")
            MyTextField("Email")
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}