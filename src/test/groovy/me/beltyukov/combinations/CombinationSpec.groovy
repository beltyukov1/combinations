package me.beltyukov.combinations

import spock.lang.Specification

class CombinationSpec extends Specification {

    def 'correct number combinations are printed from initial vector'() {
        given:
        def initialVector = ['1', '2', '3'] as String[]
        def combinationSet = 2

        when:
        def combinations = Combination.getAllPossibleCombinations(initialVector, combinationSet)

        then:
        combinations.size() == 3
    }
}
