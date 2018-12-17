package br.com.philippesis.difscreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerVeiculo;
    private Spinner spinnerEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner veículos
        spinnerVeiculo = (Spinner) findViewById(R.id.idSpinnerVeículo);

        String[] veiculos = {"Selecione um veículo", "Aeronave", "Motocicleta", "Embarcação", "Automóvel"};

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, veiculos);

        spinnerVeiculo.setAdapter(adapter);

        // Spinner Estados
        spinnerEstado = (Spinner) findViewById(R.id.idSpinnerEstado);

        String[] estado = {"Selecione um estado", "São Paulo", "Minas Gerais", "Rio de Janeiro", "Espirito Santo"};

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, estado);

        spinnerEstado.setAdapter(adapter2);

    }
}
