package com.dsi31g5.coronavirus2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class inscription extends AppCompatActivity {
    EditText editnom, editprenom, editemail, editmdp;
    Button btninscrit;
    TextView sign_in;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        // Resources fichier String
        String n=getResources().getString(R.string.nomO);
        String p=getResources().getString(R.string.prenomO);
        String e=getResources().getString(R.string.emailO);
        String ee=getResources().getString(R.string.emailOO);
        String pass=getResources().getString(R.string.pass);
        String passs=getResources().getString(R.string.passs);
        String us=getResources().getString(R.string.us);
        // fin ressources fichier String

        editemail = findViewById(R.id.editemail);
        editmdp = findViewById(R.id.editmdp);
        editnom = findViewById(R.id.editnom);
        editprenom = findViewById(R.id.editprenom);
        sign_in = findViewById(R.id.sign_in);
        mAuth = FirebaseAuth.getInstance();
        btninscrit = findViewById(R.id.btninscrit);
        btninscrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editemail.getText().toString().trim();
                String password = editmdp.getText().toString().trim();
                String nom = editnom.getText().toString().trim();
                String prenom = editprenom.getText().toString().trim();

                // contrôle sur le champ nom
                if (TextUtils.isEmpty(nom)) {
                    editnom.setError(n);
                    editnom.requestFocus();
                    return;
                }
                //contrôle sur le champ prenom
                if (TextUtils.isEmpty(prenom)) {
                    editprenom.setError(p);
                    editprenom.requestFocus();
                    return;
                }
                //contrôle sur le champ email
                if (TextUtils.isEmpty(email)) {
                    editemail.setError(e);
                    editemail.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(editemail.getText().toString()).matches()) {
                    editemail.setError(ee);
                    editemail.requestFocus();
                    return;
                }
                //contrôle sur le champ mot de passe
                if (TextUtils.isEmpty(password)) {
                    editmdp.setError(pass);
                    editmdp.requestFocus();
                    return;
                }
                if (password.length() < 6) {
                    editmdp.setError(passs);
                    editmdp.requestFocus();
                    return;
                }
                // ajouter un utilisateur au firebase
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(nom, prenom, email);
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(inscription.this, us, Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(), information.class));
                                    }
                                    else {
                                        Toast.makeText(inscription.this, "Error !" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                    }
                });
            }
        });
                // afficher l'interface d'authentification
                sign_in.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), login.class));
                    }
                });
            }
        }