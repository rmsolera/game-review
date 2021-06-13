package gamereview

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class GameSpec extends Specification implements DomainUnitTest<Game> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }

    // void "Test that Game has properties name, description and price"() {  
    // when: "A game is created with the given name, description and price"  
    //     String name = 'GTA'
    //     String description = 'This is the best car game ever developed'  
    //     String price  = '34.9'  
    //     Game game = new Game(name:name, description:description, price:price)  
    // then: "The details are set to the Game"  
    //     game.name == name  
    //     game.description == description
    //     game.price == price 
//}  
}
