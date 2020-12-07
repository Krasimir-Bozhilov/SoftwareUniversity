package CounterStriker.models.field;

import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;

import java.util.Collection;
import java.util.stream.Collectors;

public class FieldImpl implements Field {
    @Override
    public String start(Collection<Player> players) {
        Collection<Player> counterTerrorist = players
                .stream()
                .filter(p -> p instanceof CounterTerrorist)
                .collect(Collectors.toList());
        Collection<Player> terrorist = players
                .stream()
                .filter(p -> p instanceof Terrorist)
                .collect(Collectors.toList());
        while (counterTerrorist.stream().anyMatch(Player::isAlive) && terrorist.stream().anyMatch(Player::isAlive)) {
            for (Player terrorists : terrorist) {
                for (Player counter : counterTerrorist) {
                    counter.takeDamage(terrorists.getGun().fire());

                }
            }
            counterTerrorist =
                    counterTerrorist.stream().filter(Player::isAlive).collect(Collectors.toList());
            for (Player counter : counterTerrorist) {
                for (Player teroris : terrorist) {
                    teroris.takeDamage(counter.getGun().fire());
                }

            }

        }    terrorist = terrorist.stream().filter(Player::isAlive).collect(Collectors.toList());
        return terrorist.stream().anyMatch(Player::isAlive) ? "Terrorist Wins!" : "CounterTerrorist Win!";

    }
}
