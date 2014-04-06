(ns matching-pennies-test.core)

(defn determine-round-result [[matcher-choice mismatcher-choice]]
  "Maps matcher's choice and mismatcher's choice to win/loss outcome"
  (let [valid-choices #{'h' 't'}]
   (if (and (contains? valid-choices matcher-choice)
            (contains? valid-choices mismatcher-choice))
       (if (= matcher-choice mismatcher-choice)
           ['w' 'l']
           ['l' 'w'])
    nil)))




