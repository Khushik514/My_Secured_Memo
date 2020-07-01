package com.example.androidstudiolab;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.text.TextUtils;
        import android.text.method.PasswordTransformationMethod;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText fno,sno,addition;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fno=(EditText)findViewById(R.id.fno);
        sno=(EditText)findViewById(R.id.sno);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        addition=(EditText)findViewById(R.id.addition);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno1=fno.getText().toString();
                String sno1=sno.getText().toString();
                if(TextUtils.isEmpty(fno1))
                {
                    fno.setError("Enter number");
                }
                else if(TextUtils.isEmpty((sno1)))
                {
                    sno.setError("Enter number");
                }
                else
                {
                    int n1=Integer.parseInt(fno1);
                    int n2=Integer.parseInt(sno1);
                    int s=n1+n2;
                    addition.setText(""+s);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno1=fno.getText().toString();
                String sno1=sno.getText().toString();
                if(TextUtils.isEmpty(fno1))
                {
                    fno.setError("Enter number");
                }
                else if(TextUtils.isEmpty((sno1)))
                {
                    sno.setError("Enter number");
                }
                else
                {
                    int n1=Integer.parseInt(fno1);
                    int n2=Integer.parseInt(sno1);
                    int s=n1-n2;
                    addition.setText(""+s);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno1=fno.getText().toString();
                String sno1=sno.getText().toString();
                if(TextUtils.isEmpty(fno1))
                {
                    fno.setError("Enter number");
                }
                else if(TextUtils.isEmpty((sno1)))
                {
                    sno.setError("Enter number");
                }
                else
                {
                    int n1=Integer.parseInt(fno1);
                    int n2=Integer.parseInt(sno1);
                    int s=n1*n2;
                    addition.setText(""+s);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno1=fno.getText().toString();
                String sno1=sno.getText().toString();
                if(TextUtils.isEmpty(fno1))
                {
                    fno.setError("Enter number");
                }
                else if(TextUtils.isEmpty((sno1)))
                {
                    sno.setError("Enter number");
                }
                else
                {
                    float n1=Integer.parseInt(fno1);
                    float n2=Integer.parseInt(sno1);
                    float s=n1/n2;
                    addition.setText(""+s);
                }
            }
        });
    }
}
