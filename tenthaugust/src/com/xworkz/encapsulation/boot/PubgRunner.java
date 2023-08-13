package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Pubg;

public class PubgRunner {
	

		public static void main(String[] args) {

			Pubg player = new Pubg();

			player.setPlayerName("Adhi");
			player.setLevel(40);
			player.setClan("Warriors");
			player.setHealth(90);
			player.setKills(15);
			player.setDamageDealt(1500);
			player.setRevives(2);
			player.setAlive(true);
			player.setInventory("First Aid Kit");

			player.setWeaponsAmmo(23);

			player.setCurrentLocation("Erangel");
			player.setRank(5);
			player.setEquippedWeapon("M416");
			player.setMatchResult("Winner");

			System.out.println(player.getPlayerName());
			System.out.println(player.getLevel());
			System.out.println(player.getClan());
			System.out.println(player.getHealth());
			System.out.println(player.getKills());
			System.out.println(player.getDamageDealt());
			System.out.println(player.getRevives());
			System.out.println(player.isAlive());
			System.out.println(player.getInventory());
			System.out.println(player.getWeaponsAmmo());
			System.out.println(player.getCurrentLocation());
			System.out.println(player.getRank());
			System.out.println(player.getEquippedWeapon());
			System.out.println(player.getMatchResult());
		}

	}



