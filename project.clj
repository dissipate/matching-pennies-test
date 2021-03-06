(defproject matching-pennies-test "0.1.0-SNAPSHOT"
  :description "Matching Pennies game server daemon"
  :url "https://github.com/dissipate/matching-pennies-test"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :test-selectors {:default (complement :integration)
                     :integration :integration
                     :all (constantly true)}
  :dependencies [[org.clojure/clojure "1.6.0"]])
