package com.example.store.store;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ModeloAndroid {

    List<DroneAndroid> drones = new LinkedList<DroneAndroid>();
    Conexao conexao = new Conexao();

    
    public void addDrone(DroneAndroid drone){
        drones.add(drone);
    }


    public List<DroneAndroid> obterDrones(){
        List<DroneAndroid> drone = new ArrayList<>();
        drone.add(new DroneAndroid(001, new EspecificacaoAndroid("Mavic 4.8", "DJI", "Preto", "54kl", R.drawable.drone1, "R$ 500,00"),101));
        drone.add(new DroneAndroid(002, new EspecificacaoAndroid("AirFlyer More", "DJI", "Preto", "54kl", R.drawable.drone2, "R$ 5000,00"),102));
        drone.add(new DroneAndroid(003, new EspecificacaoAndroid("Quad Copter", "Yuneec", "Preto", "54kl", R.drawable.drone3, "R$ 1000,00"),103));
        drone.add(new DroneAndroid(004, new EspecificacaoAndroid("JDX 509", "Sony", "Preto", "54kl", R.drawable.drone4, "R$ 7000,00"),104));
        drone.add(new DroneAndroid(005, new EspecificacaoAndroid("Eachine", "Yuneec", "Preto", "54kl", R.drawable.drone5, "R$ 2998,99"),105));
        return drone;
    }

    public List<DroneAndroid> getDrones(){
        return drones;
    }
}