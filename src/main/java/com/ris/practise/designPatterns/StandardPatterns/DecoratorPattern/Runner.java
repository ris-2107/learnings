package com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern;

import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars.Car;
import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars.HyundaiCreta;
import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars.KiaSeltos;
import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars.TataNexon;
import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Decorators.FogLightMod;
import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Decorators.JBLSpeakersMod;

public class Runner {
    public static void main(String[] ar) {
        Car baseKia = new KiaSeltos();
        Car baseCreta = new HyundaiCreta();
        Car baseTataNexon = new TataNexon();

        Car kiaWithJBLSpeakersMod = new JBLSpeakersMod(baseKia);
        Car kiaWithFogLightsAndJblSpeakers = new FogLightMod(kiaWithJBLSpeakersMod);
        Car cretaWithFogAndJblSpeakers = new FogLightMod(new JBLSpeakersMod(baseCreta));
        Car tataNexonWithFogLights = new FogLightMod(baseTataNexon);

        System.out.println("kiaWithFogLightsAndJblSpeakers Cost : " + kiaWithFogLightsAndJblSpeakers.cost());
        System.out.println("cretaWithFogAndJblSpeakers Cost : " + cretaWithFogAndJblSpeakers.cost());
        System.out.println("tataNexonWithFogLights Cost : " + tataNexonWithFogLights.cost());


    }
}
