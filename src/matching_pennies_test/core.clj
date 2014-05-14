(ns matching-pennies-test.core)

(def valid-round-choices #{'h' 't'})

(defn determine-round-result [{:keys [matcher-choice mismatcher-choice]}]
  {:pre [(contains? valid-round-choices matcher-choice), (contains? valid-round-choices mismatcher-choice)]
   :post [(or (= % {:matcher 'w' :mismatcher 'l'}) (= % {:matcher 'l' :mismatcher 'w'}))] }
  "Maps matcher's choice and mismatcher's choice to win/loss outcome"
       (if (= matcher-choice mismatcher-choice)
           {:matcher 'w' :mismatcher 'l'}
           {:matcher 'l' :mismatcher 'w'}))




