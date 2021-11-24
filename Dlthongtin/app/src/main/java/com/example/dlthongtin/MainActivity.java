package com.example.dlthongtin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnHienThi;
    EditText edtHoTen,edtEmail,edtSoDienThoai,edtDiaChi,edtNgaySinh,edtMssv,edtSoThich;
    TextView txtThongtin,edtGioiTinh;
    CheckBox checkthethao, checkdulich, checkamnhac, checkDY;
    RadioButton radioNam, radioNu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        btnHienThi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                String hoten = edtHoTen.getText().toString();
                String email = edtEmail.getText().toString();
                String gioitinh = edtGioiTinh.getText().toString();
                String sodienthoai = edtSoDienThoai.getText().toString();
                String diachi = edtDiaChi.getText().toString();
                String ngaysinh = edtNgaySinh.getText().toString();
                String mssv = edtMssv.getText().toString();
                String sothich = "";
                 if (checkamnhac.isChecked()){
                     sothich += checkamnhac.getText().toString()+"  ";
                 }
                if (checkthethao.isChecked()){
                    sothich += checkthethao.getText().toString()+"  ";
                }
                if (checkdulich.isChecked()){
                    sothich += checkdulich.getText().toString()+"  ";
                }
                checkDY.setOnCheckedChangeListener((compoundButton, b) -> {
                    if (checkDY.isChecked()) {
                        btnHienThi.setClickable(true);
                        btnHienThi.setBackgroundColor(R.color.white);
                    }
                    else {
                        btnHienThi.setClickable(false);
                        btnHienThi.setBackgroundColor(R.color.black);
                    }
                });

                if (hoten.length()==0   ){
                    edtHoTen.setError("Bạn bắt buộc phải nhập");
                } else {
                    edtHoTen.setError(null);
                }
                if (mssv.length()==0    ){
                    edtMssv.setError("Bạn bắt buộc phải nhập");
                } else {
                    edtMssv.setError(null);
                }
                if (ngaysinh.length()==0   ){
                    edtNgaySinh.setError("Bạn bắt buộc phải nhập");
                } else {
                    edtNgaySinh.setError(null);
                }
                if (sodienthoai.length()==0   ){
                    edtSoDienThoai.setError("Bạn bắt buộc phải nhập");
                } else {
                    edtSoDienThoai.setError(null);
                }
                if (email.length()==0   ){
                    edtEmail.setError("Bạn bắt buộc phải nhập");
                } else {
                    edtEmail.setError(null);
                }

            }
        });
    }
    private void Anhxa(){
        btnHienThi = (Button) findViewById(R.id.hienthi);
        edtHoTen = (EditText) findViewById(R.id.hoten);
        edtEmail = (EditText) findViewById(R.id.email);
        edtSoDienThoai = (EditText) findViewById(R.id.sodienthoai);
        edtDiaChi = (EditText) findViewById(R.id.diachi);
        edtNgaySinh = (EditText) findViewById(R.id.ngaysinh);
        edtMssv = (EditText) findViewById(R.id.mssv);
        edtGioiTinh = (TextView) findViewById(R.id.gioitinh);
        txtThongtin = (TextView) findViewById(R.id.thongtin);
        checkDY = (CheckBox) findViewById(R.id.dongydk);
        checkamnhac = (CheckBox) findViewById(R.id.checkamnhac);
        checkdulich = (CheckBox) findViewById(R.id.checkdulich);
        checkthethao = (CheckBox) findViewById(R.id.checkthethao);
        radioNam = (RadioButton) findViewById(R.id.radioNam);
        radioNu = (RadioButton) findViewById(R.id.radioNu);
        RadioGroup radioGroup = findViewById(R.id.radiogroup);
        int id = radioGroup.getCheckedRadioButtonId();
        if (id == R.id.radioNam) {

        } else {

        }



    }
}