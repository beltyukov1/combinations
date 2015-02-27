package me.beltyukov.combinations

import org.paukov.combinatorics.Factory

class Combination {

    public static void main(String[] args) {
        if (!args || args.size() != 2) {
            println "Usage: `./combinations <initial set> <desired combination length>`"
        } else {
            def initialVector = args?.first()?.split(',')
            def combinationSet = args[1] as Integer

            getAllPossibleCombinations(initialVector, combinationSet)
        }
    }

    static List getAllPossibleCombinations(String[] initialVector, Integer combinationSet) {
        def combinatoricsVector = Factory.createVector(initialVector)
        def generator = Factory.createSimpleCombinationGenerator(combinatoricsVector, combinationSet)
        println "SUCCESS! Total combinations generated: ${generator.size()}"
        generator.collect {
            println it.vector
            it.vector
        }
    }
}
