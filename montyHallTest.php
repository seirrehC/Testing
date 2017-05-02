<?php

// Simulation to test whether swapping is the right choice.

echo "Hello World!\n";
echo "New Change here!\n";


$result = runSimulations(10000);


echo "Result for even game with 1/3 odds is: $result\n";

$unevenResult = runUnevenSimulations(10000);

echo "Result for uneven game with 1/3 odds is: $unevenResult\n";

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

function runUnevenSimulations($numOfSims) {
    $winrate = 0;
    $numGames = 0;

    for ($i = 0; $i<$numOfSims; $i++) {
        $randNum = rand(1,3);
        $winningNum = rand(1,3);
        $numGames++;
        $listOfNums = array(1,2,3);

        $valToRemove = 6 - $randNum - $winningNum;

        //$winningKey = array_search($winningNum, $listOfNums);
        $chosenKey = array_search($randNum, $listOfNums);
        $keyToRemove = array_search($valToRemove, $listOfNums);

        //unset($listOfNums[$winningKey]);
        unset($listOfNums[$chosenKey]);
        unset($listOfNums[$keyToRemove]);


        //$valToRemove = array_pop($listOfNums);

        $randNum = array_pop($listOfNums);




        if ($randNum == $winningNum) {
            $winrate++;
        }
    }

    return $winrate/$numGames;
}



?>
