package srkr.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText e1,e2;
     TextView t2,t3;
     String a,b,result,cost;int i,j,res,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       e1=(EditText)findViewById(R.id.defaultval);
       e2=(EditText)findViewById(R.id.val);
       Button b1=(Button)findViewById(R.id.b1);
       t2=(TextView)findViewById(R.id.changedtext);
       t3=(TextView)findViewById(R.id.cost);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               a=e1.getText().toString().trim();
               b=e2.getText().toString().trim();
             i=Integer.parseInt(a);
             j=Integer.parseInt(b);
             res=i+j;

             c=res*10;
             result=Integer.toString(res);
             t2.setText(result);
             cost=Integer.toString(c);
             t3.setText(cost);
               Toast.makeText(MainActivity.this,"orders:"+res+","+"total cost is Rs."+c,Toast.LENGTH_SHORT).show();
           }
       });
    }
}
