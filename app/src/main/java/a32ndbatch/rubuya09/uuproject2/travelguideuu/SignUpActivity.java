package a32ndbatch.rubuya09.uuproject2.travelguideuu;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etEmail,etPassword;
    private FirebaseAuth firebaseAuth;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etEmail= (EditText) findViewById(R.id.etEmailSignup);
        etPassword= (EditText) findViewById(R.id.etPasswordSignUp);
        progressBar= (ProgressBar) findViewById(R.id.progresbarSignup);
        findViewById(R.id.imSignupSignup).setOnClickListener(this);
        findViewById(R.id.tvLoginHere).setOnClickListener(this);
        firebaseAuth=FirebaseAuth.getInstance();
    }
    private void userRegister(){
        String email=etEmail.getText().toString().trim();
        String password=etPassword.getText().toString().trim();
        if(email.isEmpty()){
            etEmail.setError("Email is empty");
            etEmail.setBackgroundColor(Color.RED);
            etEmail.requestFocus();
            return;
        }
        //for emai pattern checking
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            etEmail.setError("Required vlaid email address");
            etEmail.setBackgroundColor(Color.RED);
            etEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            etEmail.setError("password is empty");
            etEmail.setBackgroundColor(Color.RED);
            etEmail.requestFocus();
            return;
        }
        if(password.length()<4){
            etEmail.setError("minimum passwoerd length is 4");
            etEmail.setBackgroundColor(Color.RED);
            etEmail.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Signup successfull",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(SignUpActivity.this,ProfileActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imSignupSignup:
                userRegister();
                break;
            case R.id.tvLoginHere:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
