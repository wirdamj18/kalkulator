package ac.id.poltekkampar.projek1ku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


        public class MainActivity extends AppCompatActivity {
            TextView Layar;
            Button Sembilan, Delapan, Tujuh, Enam, Lima, Empat, Tiga, Dua, Satu, Nol, Bagi, Kali, Kurang, Tambah, Bersih, Titik, Hitung;
            String angka;
            double bil1, bil2, jumlah;
            int pilih;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Layar = Layar.findViewById(R.id.Layar);

                Sembilan = Sembilan.findViewById(R.id.Sembilan);
                Sembilan.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "9";
                        Layar.setText(angka);
                    }
                });

                Delapan = Delapan.findViewById(R.id.Delapan);
                Delapan.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "8";
                        Layar.setText(angka);
                    }
                });

                Tujuh = Tujuh.findViewById(R.id.Tujuh);
                Tujuh.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "7";
                        Layar.setText(angka);
                    }
                });

                Enam = Enam.findViewById(R.id.Enam);
                Enam.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "6";
                        Layar.setText(angka);
                    }
                });

                Lima= Lima.findViewById(R.id.Lima);
                Lima.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "5";
                        Layar.setText(angka);
                    }
                });

                Empat = Empat.findViewById(R.id.Empat);
                Empat.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "4";
                        Layar.setText(angka);
                    }
                });

                Tiga = Tiga.findViewById(R.id.Tiga);
                Tiga.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "3";
                        Layar.setText(angka);
                    }
                });

                Dua = Dua.findViewById(R.id.Dua);
                Dua.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "2";
                        Layar.setText(angka);
                    }
                });

                Satu = Satu.findViewById(R.id.Satu);
                Satu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "1";
                        Layar.setText(angka);
                    }
                });

                Nol = Nol.findViewById(R.id.Nol);
                Nol.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += "0";
                        Layar.setText(angka);
                    }
                });

                Titik = findViewById(R.id.Titik);
                Titik.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        angka += ".";
                        Layar.setText(angka);
                    }
                });

                Hitung = Hitung.findViewById(R.id.Hitung);
                Hitung.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Layar.setText("=");
                        switch(pilih){
                            case 1:
                                bil2=Double.parseDouble(angka);
                                jumlah=bil1/bil2;
                                angka=Double.toString(jumlah);
                                Layar.setText(angka);
                                break;

                            case 2:
                                bil2=Double.parseDouble(angka);
                                jumlah=bil1*bil2;
                                angka=Double.toString(jumlah);
                                Layar.setText(angka);
                                break;

                            case 3:
                                bil2=Double.parseDouble(angka);
                                jumlah=bil1+bil2;
                                angka=Double.toString(jumlah);
                                Layar.setText(angka);
                                break;

                            case 4:
                                bil2=Double.parseDouble(angka);
                                jumlah=bil1-bil2;
                                angka=Double.toString(jumlah);
                                Layar.setText(angka);
                                break;
                        }
                    }
                });

                Bagi = Bagi.findViewById(R.id.Bagi);
                Bagi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        bil1=Double.parseDouble(angka);
                        Layar.setText("/");
                        angka="";
                        pilih=1;
                    }
                });

                Kali = Kali.findViewById(R.id.Kali);
                Kali.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        bil1=Double.parseDouble(angka);
                        Layar.setText("*");
                        angka="";
                        pilih=2;
                    }
                });

                Tambah = Tambah.findViewById(R.id.Tambah);
                Tambah.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        bil1=Double.parseDouble(angka);
                        Layar.setText("+");
                        angka="";
                        pilih=3;
                    }
                });

                Kurang = Kurang.findViewById(R.id.Kurang);
                Kurang.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        bil1=Double.parseDouble(angka);
                        Layar.setText("-");
                        angka="";
                        pilih=4;;
                    }
                });

                Bersih = Bersih.findViewById(R.id.Bersih);
                Bersih.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Layar.setText(null);
                        bil1 = (int) 0.0;
                        bil2 = (int) 0.0;
                        jumlah = (int) 0.0;
                        angka = "";
                    }
                });

            }

            public void setContentView(int activity_main) {
            }
        }

