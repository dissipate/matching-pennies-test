(ns matching-pennies-test.core)

(defn determine-round-result [{:keys [matcher-choice mismatcher-choice]}]
  {:pre [(contains? #{'h' 't'} matcher-choice), (contains? #{'h' 't'} mismatcher-choice)]
   :post [(or (= % {:matcher 'w' :mismatcher 'l'}) (= % {:matcher 'l' :mismatcher 'w'}))] }
  "Maps matcher's choice and mismatcher's choice to win/loss outcome"
       (if (= matcher-choice mismatcher-choice)
           {:matcher 'w' :mismatcher 'l'}
           {:matcher 'l' :mismatcher 'w'}))




