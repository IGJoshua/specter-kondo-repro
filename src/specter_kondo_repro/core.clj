(ns specter-kondo-repro.core
  (:require
    [com.rpl.specter :refer :all])
  (:gen-class))

(defn -main
  [& args]
  (prn (select [:a ALL :b] {:a [{:b 1} {:b 2}]})))
