package srt.Core;

import java.util.ArrayList;
import java.util.List;

import srt.Abstractions.ItemGenerator;
import srt.Rewards.Gold.GoldGenerator;

public class Core {
    /**
     * Логика игры
     */
    public void run(){
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        ItemGenerator myGenerator = generatorList.get(0);

        System.out.println(myGenerator.openReward());
    }
}
