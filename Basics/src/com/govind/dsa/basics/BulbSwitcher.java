package com.govind.dsa.basics;

public class BulbSwitcher {

    public static void main(String[] args) {
        int input=3;
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d", input, input, bulbSwitch(input)));
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d%n", input, input, optimizesBulbSwitch(input)));

        input=10;
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d", input, input, bulbSwitch(input)));
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d%n", input, input, optimizesBulbSwitch(input)));

        input=898;
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d", input, input, bulbSwitch(input)));
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d%n", input, input, optimizesBulbSwitch(input)));

        input=89899;
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d", input, input, bulbSwitch(input)));
        System.out.println(String.format("Input No of Bulbs: %-6d | Rotations: %-6d | Bulbs ON: %-6d%n", input, input, optimizesBulbSwitch(input)));

    }

    public static int bulbSwitch(int n) {
        int ans=0;
        for(int bulb=1; bulb<=n; bulb++){
            int factors =0;
            for(int i=1; i <= bulb; i++){
                if(bulb%i == 0) factors++;
            }

            if(factors%2 ==1) ans++;
        }
        return ans;
    }

    public static int optimizesBulbSwitch(int n) {
        int bulbsRemainOn=0;
        for(int bulb = 1; bulb*bulb <= n; bulb++){
            bulbsRemainOn++;
        }
        return bulbsRemainOn;
    }
}
