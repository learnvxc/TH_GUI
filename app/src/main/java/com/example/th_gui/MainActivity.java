package com.example.th_gui;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumberA, edtNumberB;
    private TextView txtResult;
    private Button btnSum, btnDifference, btnProduct, btnQuotient, btnGCD, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các view
        edtNumberA = findViewById(R.id.edtNumberA);
        edtNumberB = findViewById(R.id.edtNumberB);
        txtResult = findViewById(R.id.txtResult);
        btnSum = findViewById(R.id.btnSum);
        btnDifference = findViewById(R.id.btnDifference);
        btnProduct = findViewById(R.id.btnProduct);
        btnQuotient = findViewById(R.id.btnQuotient);
        btnGCD = findViewById(R.id.btnGCD);
        btnExit = findViewById(R.id.btnExit);

        // Tính tổng
        btnSum.setOnClickListener(view -> {
            int a = Integer.parseInt(edtNumberA.getText().toString());
            int b = Integer.parseInt(edtNumberB.getText().toString());
            txtResult.setText("Tổng: " + (a + b));
        });

        // Tính hiệu
        btnDifference.setOnClickListener(view -> {
            int a = Integer.parseInt(edtNumberA.getText().toString());
            int b = Integer.parseInt(edtNumberB.getText().toString());
            txtResult.setText("Hiệu: " + (a - b));
        });

        // Tính tích
        btnProduct.setOnClickListener(view -> {
            int a = Integer.parseInt(edtNumberA.getText().toString());
            int b = Integer.parseInt(edtNumberB.getText().toString());
            txtResult.setText("Tích: " + (a * b));
        });

        // Tính thương
        btnQuotient.setOnClickListener(view -> {
            int a = Integer.parseInt(edtNumberA.getText().toString());
            int b = Integer.parseInt(edtNumberB.getText().toString());
            if (b != 0) {
                txtResult.setText("Thương: " + (a / b));
            } else {
                txtResult.setText("Lỗi: Không thể chia cho 0");
            }
        });

        // Tính ước chung lớn nhất (GCD)
        btnGCD.setOnClickListener(view -> {
            int a = Integer.parseInt(edtNumberA.getText().toString());
            int b = Integer.parseInt(edtNumberB.getText().toString());
            txtResult.setText("Ước Chung Lớn Nhất: " + gcd(a, b));
        });

        // Thoát ứng dụng
        btnExit.setOnClickListener(view -> finish());
    }

    // Hàm tính GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Phương thức thoát ứng dụng
    public void exitApp(View view) {
        finish();
    }
}
