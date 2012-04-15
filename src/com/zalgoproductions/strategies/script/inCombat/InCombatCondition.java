package com.zalgoproductions.strategies.script.inCombat;

import org.powerbot.concurrent.strategy.Condition;
import org.powerbot.game.api.methods.interactive.Players;

public class InCombatCondition implements Condition {
	public boolean validate() {
		return Players.getLocal().getInteracting() != null;
	}
}
