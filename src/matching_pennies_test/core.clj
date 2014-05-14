(ns matching-pennies-test.core)

(defn determine-round-result [[matcher-choice mismatcher-choice]]
  {:pre [(contains? #{'h' 't'} matcher-choice), (contains? #{'h' 't'} mismatcher-choice)]
   :post [(or (= % ['w' 'l']) (= % ['l' 'w']))] }
  "Maps matcher's choice and mismatcher's choice to win/loss outcome"
       (if (= matcher-choice mismatcher-choice)
           ['w' 'l']
           ['l' 'w']))




