<?php

// Simulation to test whether swapping is the right choice.

echo "Hello World!\n";
echo "New Change here!\n";


$result = runSimulations(10);




function runSimulations($numOfSims) {

    $winrate = 0;
    $numGames = 0;
    for ($i = 0; $i<$numOfSims; $i++) {
        $randNum = rand(1,3);
        $winningNum = rand(1,3);
        $numGames++;
        if ($randNum == $winningNum) {
            $winrate++;
        }
    }

    return $winrate/$numGames;
}





?>
