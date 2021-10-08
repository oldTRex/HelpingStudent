package com.example.myapplication;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class LoginComponent {


   public static  final   GoogleSignInOptions googleSignInOptionsgso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
           .requestEmail()
           .build();

   public  void login(){


   }

}
