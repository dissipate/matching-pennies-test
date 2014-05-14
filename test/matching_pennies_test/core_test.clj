(ns matching-pennies-test.core-test
  (:require [clojure.test :refer :all]
            [matching-pennies-test.core :refer :all]))

(deftest determine-round-result-test
  (testing "round result mappings"
    (is (= (determine-round-result ['t' 't']) ['w' 'l']))
    (is (= (determine-round-result ['h' 'h']) ['w' 'l']))
    (is (= (determine-round-result ['t' 'h']) ['l' 'w']))
    (is (= (determine-round-result ['h' 't']) ['l' 'w']))
    (is (thrown? AssertionError (determine-round-result ['blah' 't'])))
    (is (thrown? AssertionError (determine-round-result ['t' 'blah'])))
    (is (thrown? AssertionError (determine-round-result ['blah' 'blah'])))))

(deftest ^:integration test-slurp
  (testing "slurp test"
    (is (not= (count (slurp "http://www.google.com")) 0))))
