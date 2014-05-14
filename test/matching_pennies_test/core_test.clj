(ns matching-pennies-test.core-test
  (:require [clojure.test :refer :all]
            [matching-pennies-test.core :refer :all]))

(deftest determine-round-result-test
  (testing "round result mappings"
    (is (= (determine-round-result {:matcher-choice 't' :mismatcher-choice 't'}) {:matcher 'w' :mismatcher 'l'}))
    (is (= (determine-round-result {:matcher-choice 'h' :mismatcher-choice 'h'}) {:matcher 'w' :mismatcher 'l'}))
    (is (= (determine-round-result {:matcher-choice 't' :mismatcher-choice 'h'}) {:matcher 'l' :mismatcher 'w'}))
    (is (= (determine-round-result {:matcher-choice 'h' :mismatcher-choice 't'}) {:matcher 'l' :mismatcher 'w'}))
    (is (thrown? AssertionError (determine-round-result {:matcher-choice 'blah' :mismatcher-choice 't'})))
    (is (thrown? AssertionError (determine-round-result {:matcher-choice 't' :mismatcher-choice 'blah'})))
    (is (thrown? AssertionError (determine-round-result {:matcher-choice 'blah' :mismatcher-choice 'blah'})))))

(deftest ^:integration test-slurp
  (testing "slurp test"
    (is (not= (count (slurp "http://www.google.com")) 0))))
