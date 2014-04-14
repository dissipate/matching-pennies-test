(ns matching-pennies-test.core-test
  (:require [clojure.test :refer :all]
            [matching-pennies-test.core :refer :all]))

(deftest determine-round-result-test
  (testing "round result mappings"
    (is (= (determine-round-result ['t' 't']) ['w' 'l']))
    (is (= (determine-round-result ['h' 'h']) ['w' 'l']))
    (is (= (determine-round-result ['t' 'h']) ['l' 'w']))
    (is (= (determine-round-result ['h' 't']) ['l' 'w']))
    (is (= (determine-round-result ['blah' 't']) nil))
    (is (= (determine-round-result ['t' 'blah']) nil))
    (is (= (determine-round-result ['blah' 'blah']) nil))))

(deftest ^:integration test-slurp
  (testing "slurp test"
    (is (not= (count (slurp "http://www.google.com")) 0))))
